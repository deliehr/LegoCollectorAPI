package de.liehrit.legocollectorapi.controller;
import de.liehrit.legocollectorapi.model.SetContainerResponse;
import de.liehrit.legocollectorapi.model.SetResponse;
import de.liehrit.legocollectorapi.model.SetsResponse;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/lego", produces = "application/json")
public class LegoController {

    @Value("${lego.api.url}")
    private String legoApiUrl;

    @Value("${lego.api.key}")
    private String legoApiKey;

    private static final Logger logger = LoggerFactory.getLogger(LegoController.class);

    private List<SetResponse> cache;    // otherwise use reddis

    private DateTime lastRequest;

    @GetMapping(value = "/sets")
    public List<SetResponse> getSets() throws Exception {
        if(lastRequest != null && cache != null && cache.size() > 0) {
            var duration = new Duration(lastRequest, DateTime.now());

            if(duration.getStandardMinutes() <= 15) {
                return cache;
            }
        }

        WebClient client = WebClient.create();

        if(legoApiUrl == null || legoApiUrl.length() == 0 || legoApiKey == null || legoApiKey.length() == 0) {
            var status = HttpStatus.valueOf(500);

            throw new ResponseStatusException(status);
        }

        var headerValue = String.format("key %s", legoApiKey);

        try {
            var rebrickableResponse = client.get()
                    .uri(new URI(legoApiUrl))
                    .header("Authorization", headerValue)
                    .accept(MediaType.APPLICATION_JSON)
                    .retrieve()
                    .bodyToMono(SetsResponse.class)
                    .block();

            if(rebrickableResponse != null) {
                lastRequest = DateTime.now();

                var mappedResponse = rebrickableResponse.getResults().stream().map(SetContainerResponse::getSet).toList();

                cache = mappedResponse;

                return mappedResponse;
            }
        } catch (Exception e) {
            logger.debug(e.getLocalizedMessage());

            throw e;
        }

        return null;
    }
}

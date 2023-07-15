package de.liehrit.legocollectorapi.controller;
import de.liehrit.legocollectorapi.model.LegoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/lego", produces = "application/json")
public class LegoController {
    @GetMapping(value = "/sets")
    public LegoResponse getSets() {
        return new LegoResponse();
    }
}

package de.liehrit.legocollectorapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/lego", produces = "application/json")
public class LegoController {
    @GetMapping(value = "/sets")
    public List<String> getSets() {
        return Arrays.asList("Ryan", "Julie", "Bob");
    }
}

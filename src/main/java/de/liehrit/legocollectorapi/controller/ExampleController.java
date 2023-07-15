package de.liehrit.legocollectorapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/example", produces = "application/json")
public class ExampleController {
    @GetMapping(value = "")
    public String getTest() {
        return "My great Api";
    }
}

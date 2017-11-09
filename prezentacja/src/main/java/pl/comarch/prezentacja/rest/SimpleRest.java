package pl.comarch.prezentacja.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRest {

    @Value("${random.int}")
    private Integer number;


    @GetMapping("/number")
    public String getNumber() {
        return "Moj numer to: " + number;
    }
}

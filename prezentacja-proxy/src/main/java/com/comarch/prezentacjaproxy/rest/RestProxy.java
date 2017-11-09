package com.comarch.prezentacjaproxy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestProxy {

    @GetMapping("/proxy")
    public String getProxy() {
        RestTemplate restTemplate = new RestTemplate();
        return "Proxy" + restTemplate.getForObject("http://prezentacja:8080/number", String.class);
    }
}

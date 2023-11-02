package dev.galiev.countryservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class CountriesController {

    @GetMapping
    public String hello() {
        return "Hello";
    }
}

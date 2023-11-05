package dev.galiev.countryservice.controllers;

import dev.galiev.countryservice.dto.CountryInfo;
import dev.galiev.countryservice.model.countries.Countries;
import dev.galiev.countryservice.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("countries/")
public class CountriesController {

    @Autowired
    CountriesService service;

    @GetMapping
    public Countries countries() {
        return service.getCountries();
    }

    @GetMapping("{name}")
    public CountryInfo country(@PathVariable String name) {
        return service.getCountryInfoByName(name);
    }
}

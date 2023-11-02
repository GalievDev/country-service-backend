package dev.galiev.countryservice.service;

import dev.galiev.countryservice.dto.CountryInfo;
import dev.galiev.countryservice.model.countries.Countries;

public interface CountriesService {
    Countries getCountries();

    CountryInfo getCountryInfoByName(String name);
}

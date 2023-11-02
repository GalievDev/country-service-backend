package dev.galiev.countryservice.model.countries;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public record CountryData(String name, @JsonSetter("Iso2") String country_code) {
    @Override
    @JsonGetter("country_code")
    public String country_code() {
        return country_code;
    }
}

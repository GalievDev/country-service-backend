package dev.galiev.countryservice.model.capital;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public record CapitalData(String capital, @JsonSetter("iso2") String country_code) {
    @Override
    @JsonGetter("country_code")
    public String country_code() {
        return country_code;
    }
}
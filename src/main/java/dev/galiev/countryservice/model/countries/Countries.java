package dev.galiev.countryservice.model.countries;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public record Countries(String msg, Boolean error, @JsonSetter("data") List<CountryData> countries) {
    @Override
    @JsonGetter("countries")
    public List<CountryData> countries() {
        return countries;
    }
}

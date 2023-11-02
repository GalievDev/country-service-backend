package dev.galiev.countryservice.model.capital;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Capital(String msg, Boolean error, @JsonProperty("data") CapitalData capitalData) {
}

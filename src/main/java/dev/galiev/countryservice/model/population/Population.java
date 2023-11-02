package dev.galiev.countryservice.model.population;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Population(@JsonProperty("data") PopulationData populationData) {
}

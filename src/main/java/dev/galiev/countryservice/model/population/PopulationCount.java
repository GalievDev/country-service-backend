package dev.galiev.countryservice.model.population;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PopulationCount {
    private final Long year;
    @JsonSetter("value")
    private final Long population;

    public PopulationCount() {
        this.year = (long) -1;
        this.population = (long) -1;
    }

    public Long getYear() {
        return year;
    }

    @JsonGetter("population")
    public Long getPopulation() {
        return population;
    }
}

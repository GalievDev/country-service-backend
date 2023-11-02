package dev.galiev.countryservice.model.population;

import java.util.List;

public class PopulationData {
    private String code;
    private List<PopulationCount> populationCounts;

    public List<PopulationCount> getPopulationCounts() {
        return populationCounts;
    }

    public String getCode() {
        return code;
    }

    public Long getLatestPopulation() {
        return !populationCounts.isEmpty() ? populationCounts.get(populationCounts.size() - 1).getPopulation() : -1;
    }
}

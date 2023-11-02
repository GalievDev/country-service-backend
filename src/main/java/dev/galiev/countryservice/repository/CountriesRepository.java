package dev.galiev.countryservice.repository;

import dev.galiev.countryservice.model.capital.Capital;
import dev.galiev.countryservice.model.countries.Countries;
import dev.galiev.countryservice.model.flag.Flag;
import dev.galiev.countryservice.model.population.Population;

public interface CountriesRepository {
    Countries getCountries();

    Population getPopulation(String countryName);

    Flag getFlag(String countryName);

    Capital getCapital(String countryName);
}

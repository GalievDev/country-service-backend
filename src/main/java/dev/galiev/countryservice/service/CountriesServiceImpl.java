package dev.galiev.countryservice.service;

import dev.galiev.countryservice.dto.CountryInfo;
import dev.galiev.countryservice.model.countries.Countries;
import dev.galiev.countryservice.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountriesServiceImpl implements CountriesService{

    @Autowired
    CountriesRepository countriesRepository;

    @Override
    public Countries getCountries() {
        return countriesRepository.getCountries();
    }

    @Override
    public CountryInfo getCountryInfoByName(String name) {
        return new CountryInfo(
                name,
                countriesRepository.getCapital(name).capitalData().country_code(),
                countriesRepository.getCapital(name).capitalData().capital(),
                countriesRepository.getPopulation(name).populationData().getLatestPopulation(),
                countriesRepository.getFlag(name).flagData().flag_file_url()
        );
    }
}

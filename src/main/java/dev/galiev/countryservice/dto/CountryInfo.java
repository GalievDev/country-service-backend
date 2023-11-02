package dev.galiev.countryservice.dto;

public class CountryInfo {
    private final String name;
    private final String country_code;
    private final String capital;
    private final Long population;
    private final String flag_file_url;


    public CountryInfo() {
        this.name = "none";
        this.country_code = "none";
        this.capital = "none";
        this.population = (long) -1;
        this.flag_file_url = "none";
    }

    public CountryInfo(String name, String country_code, String capital, Long population, String flag_file_url) {
        this.name = name;
        this.country_code = country_code;
        this.capital = capital;
        this.population = population;
        this.flag_file_url = flag_file_url;
    }

    public String getName() {
        return name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getCapital() {
        return capital;
    }

    public Long getPopulation() {
        return population;
    }

    public String getFlag_file_url() {
        return flag_file_url;
    }
}

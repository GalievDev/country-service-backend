package dev.galiev.countryservice.model.flag;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public record FlagData(@JsonSetter("flag") String flag_file_url) {
    @Override
    @JsonGetter("flag_file_url")
    public String flag_file_url() {
        return flag_file_url;
    }
}

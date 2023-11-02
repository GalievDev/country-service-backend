package dev.galiev.countryservice.model.flag;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Flag(@JsonProperty("data") FlagData flagData) {
}

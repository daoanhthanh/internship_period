package vn.daoanhthanh.car_intern.domain.model.entity.car_component;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CarType {
    @JsonProperty("sport car")
    SPORT,
    @JsonProperty("city car")
    CITY,
    @JsonProperty("SUV")
    SUV,
    @JsonProperty("sedan")
    SEDAN
}

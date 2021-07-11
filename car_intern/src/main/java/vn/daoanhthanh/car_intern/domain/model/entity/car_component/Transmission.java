package vn.daoanhthanh.car_intern.domain.model.entity.car_component;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Just a car component
 */
public enum Transmission {
    @JsonProperty("single speed")
    SINGLE_SPEED,
    MANUAL,
    AUTOMATIC,
    SEMI_AUTOMATIC
}

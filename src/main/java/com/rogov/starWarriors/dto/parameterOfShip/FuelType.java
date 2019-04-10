package com.rogov.starWarriors.dto.parameterOfShip;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FuelType {

    @JsonProperty("diesel")
    DIESEL,
    @JsonProperty("petrol")
    PETROL,
    @JsonProperty("gas")
    GAS,
    @JsonProperty("uranium")
    URANIUM
}

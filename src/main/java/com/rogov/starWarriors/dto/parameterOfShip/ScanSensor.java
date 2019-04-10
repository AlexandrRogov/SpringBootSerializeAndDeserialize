package com.rogov.starWarriors.dto.parameterOfShip;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ScanSensor {

    @JsonProperty("common")
    COMMON,
    @JsonProperty("infrared")
    INFRARED,
    @JsonProperty("laser")
    LASER,
    @JsonProperty("x-ray")
    XRAY
}

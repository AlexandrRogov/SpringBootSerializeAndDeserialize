package com.rogov.starWarriors.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rogov.starWarriors.dto.parameterOfShip.parameterOfNotWarShipDto.ParameterOfSpyProbe;
import com.rogov.starWarriors.dto.parameterOfShip.parameterOfNotWarShipDto.ParameterOfTransport;
import com.rogov.starWarriors.dto.parameterOfShip.parameterOfWarShipDto.ParameterOfCruiser;
import com.rogov.starWarriors.dto.parameterOfShip.parameterOfWarShipDto.ParameterOfDeathStar;
import com.rogov.starWarriors.dto.parameterOfShip.parameterOfWarShipDto.ParameterOfFighter;

import java.util.HashMap;
import java.util.Map;

public enum TypeOfShip {

    @JsonProperty("spy_probe")
    SPY_PROBE,
    @JsonProperty("transport")
    TRANSPORT,
    @JsonProperty("cruiser")
    CRUISER,
    @JsonProperty("death_star")
    DEATH_STAR,
    @JsonProperty("fighter")
    FIGHTER;

    private static Map<String, Class> classMap = new HashMap<>();

    static {
        classMap.put("transport", ParameterOfTransport.class);
        classMap.put("spy_probe", ParameterOfSpyProbe.class);
        classMap.put("cruiser", ParameterOfCruiser.class);
        classMap.put("death_star", ParameterOfDeathStar.class);
        classMap.put("fighter", ParameterOfFighter.class);
    }

    public static Class getClassOfParameter(String nameOfTransport) {
        return classMap.get(nameOfTransport);
    }
}

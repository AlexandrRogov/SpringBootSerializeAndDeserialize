package com.rogov.starWarriors.dto.parameterOfShip;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParameterOFNotWarShip.class),
        @JsonSubTypes.Type(value = ParameterOfWarShip.class)
}
)
@NoArgsConstructor
public abstract class GeneralParameter {

    private String name;
    private int fuel;
    private FuelType fuelType;
    private int armor;

    public GeneralParameter(String name, int fuel, FuelType fuelType, int armor) {
        this.name = name;
        this.fuel = fuel;
        this.fuelType = fuelType;
        this.armor = armor;
    }
}

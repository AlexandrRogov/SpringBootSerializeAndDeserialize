package com.rogov.starWarriors.dto.parameterOfShip;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class ParameterOFNotWarShip extends GeneralParameter {

    private String colour;

    public ParameterOFNotWarShip(String name, int fuel, FuelType fuelType, int armor, String colour) {
        super(name, fuel, fuelType, armor);
        this.colour = colour;
    }

}

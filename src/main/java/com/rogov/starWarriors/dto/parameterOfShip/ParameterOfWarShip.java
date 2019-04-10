package com.rogov.starWarriors.dto.parameterOfShip;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class ParameterOfWarShip extends GeneralParameter {

    private int firePower;

    public ParameterOfWarShip(String name, int fuel, FuelType fuelType, int armor, int firePower) {
        super(name, fuel, fuelType, armor);
        this.firePower = firePower;
    }
}

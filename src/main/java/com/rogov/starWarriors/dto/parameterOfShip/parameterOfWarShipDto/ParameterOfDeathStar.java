package com.rogov.starWarriors.dto.parameterOfShip.parameterOfWarShipDto;

import com.rogov.starWarriors.dto.parameterOfShip.FuelType;
import com.rogov.starWarriors.dto.parameterOfShip.ParameterOfWarShip;
import lombok.Data;

@Data
public class ParameterOfDeathStar extends ParameterOfWarShip {

    private int numberOfFighter;

    public ParameterOfDeathStar(String name, int fuel, FuelType fuelType, int armor, int firePower, int numberOfFighter) {
        super(name, fuel, fuelType, armor, firePower);
        this.numberOfFighter = numberOfFighter;
    }
}

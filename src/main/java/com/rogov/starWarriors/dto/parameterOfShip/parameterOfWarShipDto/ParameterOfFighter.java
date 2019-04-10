package com.rogov.starWarriors.dto.parameterOfShip.parameterOfWarShipDto;

import com.rogov.starWarriors.dto.parameterOfShip.FuelType;
import com.rogov.starWarriors.dto.parameterOfShip.ParameterOfWarShip;
import lombok.Data;

@Data
public class ParameterOfFighter extends ParameterOfWarShip {

    private int flightSpeed;

    public ParameterOfFighter(String name, int fuel, FuelType fuelType, int armor, int firePower, int flightSpeed) {
        super(name, fuel, fuelType, armor, firePower);
        this.flightSpeed = flightSpeed;
    }
}

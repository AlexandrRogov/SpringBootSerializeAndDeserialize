package com.rogov.starWarriors.dto.parameterOfShip.parameterOfWarShipDto;

import com.rogov.starWarriors.dto.parameterOfShip.FuelType;
import com.rogov.starWarriors.dto.parameterOfShip.ParameterOfWarShip;
import lombok.Data;

@Data
public class ParameterOfCruiser extends ParameterOfWarShip {

    private int numberOfGuns;

    public ParameterOfCruiser(String name, int fuel, FuelType fuelType, int armor, int firePower, int numberOfGuns) {
        super(name, fuel, fuelType, armor, firePower);
        this.numberOfGuns = numberOfGuns;
    }
}

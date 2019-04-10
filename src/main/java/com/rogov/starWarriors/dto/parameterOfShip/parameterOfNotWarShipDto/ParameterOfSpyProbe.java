package com.rogov.starWarriors.dto.parameterOfShip.parameterOfNotWarShipDto;

import com.rogov.starWarriors.dto.parameterOfShip.FuelType;
import com.rogov.starWarriors.dto.parameterOfShip.ParameterOFNotWarShip;
import com.rogov.starWarriors.dto.parameterOfShip.ScanSensor;
import lombok.Data;

@Data
public class ParameterOfSpyProbe extends ParameterOFNotWarShip {

    private ScanSensor scanSensor;

    public ParameterOfSpyProbe(String name, int fuel, FuelType fuelType, int armor, String colour, ScanSensor scanSensor) {
        super(name, fuel, fuelType, armor, colour);
        this.scanSensor = scanSensor;
    }
}

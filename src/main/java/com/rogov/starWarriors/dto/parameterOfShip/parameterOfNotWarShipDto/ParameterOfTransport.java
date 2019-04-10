package com.rogov.starWarriors.dto.parameterOfShip.parameterOfNotWarShipDto;

import com.rogov.starWarriors.dto.parameterOfShip.FuelType;
import com.rogov.starWarriors.dto.parameterOfShip.ParameterOFNotWarShip;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ParameterOfTransport extends ParameterOFNotWarShip {

    private int capacity;

    public ParameterOfTransport(String name, int fuel, FuelType fuelType, int armor, String colour, int capacity) {
        super(name, fuel, fuelType, armor, colour);
        this.capacity = capacity;
    }
}

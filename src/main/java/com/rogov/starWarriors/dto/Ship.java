package com.rogov.starWarriors.dto;

import com.rogov.starWarriors.dto.parameterOfShip.GeneralParameter;
import lombok.Data;

@Data
public class Ship {

    private TypeOfShip type;
    private GeneralParameter parameters;
}

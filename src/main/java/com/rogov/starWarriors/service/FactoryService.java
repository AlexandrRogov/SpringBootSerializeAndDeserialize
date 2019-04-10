package com.rogov.starWarriors.service;

import com.rogov.starWarriors.dto.Ship;
import com.rogov.starWarriors.dto.TypeOfShip;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FactoryService {

    public Ship createShip(String json) throws IOException {
        String transport = UtilOfSerializeAndDeserializeJson.getTypeOfTransportFromJson(json);
        return UtilOfSerializeAndDeserializeJson.deserializeJson(TypeOfShip.getClassOfParameter(transport), json);
    }
}

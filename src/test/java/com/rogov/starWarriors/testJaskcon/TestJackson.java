package com.rogov.starWarriors.testJaskcon;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rogov.starWarriors.dto.Ship;
import com.rogov.starWarriors.dto.TypeOfShip;
import com.rogov.starWarriors.dto.parameterOfShip.FuelType;
import com.rogov.starWarriors.dto.parameterOfShip.parameterOfNotWarShipDto.ParameterOfTransport;
import com.rogov.starWarriors.service.UtilOfSerializeAndDeserializeJson;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestJackson {

    private Ship shipExpected = new Ship();
    private Ship shipActual = new Ship();
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void serializeAndDeserializeTransportShip() throws IOException {

        shipExpected.setType(TypeOfShip.TRANSPORT);
        ParameterOfTransport transport = new ParameterOfTransport(
                "name",
                200,
                FuelType.DIESEL,
                200,
                "red",
                2000);

        shipExpected.setParameters(transport);
        mapper.enableDefaultTyping();
        String json = mapper.writeValueAsString(shipExpected);

        String nameOfTransport = UtilOfSerializeAndDeserializeJson.getTypeOfTransportFromJson(json);
        shipActual = UtilOfSerializeAndDeserializeJson.deserializeJson(TypeOfShip.getClassOfParameter(nameOfTransport), json);

        Assert.assertEquals(shipExpected, shipActual);
    }


}

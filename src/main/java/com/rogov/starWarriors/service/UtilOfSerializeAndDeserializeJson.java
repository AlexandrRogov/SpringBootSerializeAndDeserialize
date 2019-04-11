package com.rogov.starWarriors.service;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.rogov.starWarriors.dto.Ship;
import com.rogov.starWarriors.dto.parameterOfShip.GeneralParameter;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UtilOfSerializeAndDeserializeJson {

    public static String getTypeOfTransportFromJson(String json) {
        JsonFactory jsonFactory = new JsonFactory();
        String value = null;

        try (
                JsonParser jsonParser = jsonFactory.createParser(json)
        ) {
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = jsonParser.getCurrentName();

                if ("type".equals(fieldName)) {
                    jsonParser.nextToken();
                    value = jsonParser.getText();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return value;
    }

    public static Ship deserializeJson(Class<? extends GeneralParameter> transport, String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule mod = new SimpleModule();
        mod.addAbstractTypeMapping(GeneralParameter.class, transport);
        mapper.registerModule(mod);

        return mapper.readValue(json, Ship.class);
    }
}

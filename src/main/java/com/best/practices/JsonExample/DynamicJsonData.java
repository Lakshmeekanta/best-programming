package com.best.practices.JsonExample;

import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * <p>
 * For dynamic JSON fields in Java, you can use Map or 
 * JsonNode with libraries like Jackson.
 * </p>
 * 
 * @author Lakshmeekanta
 * 
 */
public class DynamicJsonData {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("--------Using Map---------");
        try {
            @SuppressWarnings("unchecked")
            Map<String, Object> map = objectMapper.readValue(jsonString, Map.class);
            
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("--------Using JsonNode---------");
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);
            
            jsonNode.fields().forEachRemaining(field -> {
                System.out.println(field.getKey() + ": " + field.getValue());
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

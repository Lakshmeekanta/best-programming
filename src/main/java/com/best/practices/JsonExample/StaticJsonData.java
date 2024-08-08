package com.best.practices.JsonExample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import lombok.Data;

/**
 * <p>
 * In Java, you can use libraries like Jackson or Gson to parse JSON.
 * </p>
 * 
 * @author Lakshmeekanta
 * 
 */
public class StaticJsonData {
    public static void main(String[] args) {
         String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("--------Using Jackson---------");

        try {
            // Assuming you have a POJO class named Person
            Person person = objectMapper.readValue(jsonString, Person.class);
            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.getCity());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("--------Using Gson---------");

        Gson gson = new Gson();
        Person person = gson.fromJson(jsonString, Person.class);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getCity());
    }
}

@Data
class Person
{
    public String name;
    public int age;
    public String city;
}
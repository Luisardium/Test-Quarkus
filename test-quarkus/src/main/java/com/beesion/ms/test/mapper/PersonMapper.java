package com.beesion.ms.test.mapper;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;

//Clase dedicada unicamente al Mapeo

public class PersonMapper {
    public static Person toEntity(PersonDto dto) {
        Person p = new Person();
        p.setName(dto.getName());
        return p;
    }
}
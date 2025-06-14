package com.beesion.ms.test.mapper;
import com.beesion.ms.model.Address;
import com.beesion.ms.test.dto.AddressDto;

public class AddressMapper {

    public static Address toEntity(AddressDto dto) {
        Address a = new Address();
        a.setZona(dto.getZona());
        a.setMunicipio(dto.getMunicipio());
        a.setDepartamento(dto.getDepartamento());
        return a;
    }

    public static AddressDto toDto(Address entity) {
        AddressDto dto = new AddressDto();
        dto.setZona(entity.getZona());
        dto.setMunicipio(entity.getMunicipio());
        dto.setDepartamento(entity.getDepartamento());
        return dto;
    }
}

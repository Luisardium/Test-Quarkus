package com.beesion.ms.test.resource;

import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.mapper.AddressMapper;
import com.beesion.ms.test.service.IAddressService;
import com.beesion.ms.test.service.IPersonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.stream.Collectors;

@Path("/address")
public class AddressResource {

    @Inject
    IAddressService addressService;

    @Inject
    IPersonService personService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertar (AddressDto dto){
        Address address = AddressMapper.toEntity(dto);
        Person person = personService.findById(dto.getPerson_id());
        if (person == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Persona con ID " + dto.getPerson_id() + " no existe.")
                    .build();
        }
        address.setPerson(person);
        addressService.save(address);
        return Response.status(Response.Status.CREATED)
                .entity("Direccion Ingresada Correctamente")
                .build();
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public List<AddressDto> listar() {
        List<Address> addresses = addressService.findAll();
        return addresses.stream()
                .map(AddressMapper::toDto)
                .collect(Collectors.toList());
    }

}

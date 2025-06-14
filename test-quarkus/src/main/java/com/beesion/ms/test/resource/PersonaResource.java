package com.beesion.ms.test.resource;

import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.mapper.AddressMapper;
import com.beesion.ms.test.mapper.PersonMapper;
import com.beesion.ms.test.service.IPersonService;
import com.beesion.ms.test.service.impl.PersonService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.stream.Collectors;

@Path("/Person")
public class PersonaResource {

	@Inject
	IPersonService personService;

	@POST
	public Response save(PersonDto dto) {
		personService.save(PersonMapper.toEntity(dto)); //No tiene logica de negocio ni mapea directamente
		return Response.ok("Elemento guardado").build();
	}

	@GET
	@Path("/{id}/address")
	@Produces(MediaType.APPLICATION_JSON)
	public Response direccionesPorId(@PathParam("id") Long personId) {
		List<Address> direcciones = personService.ObtenerDireccionPorID(personId);
		return Response.ok(direcciones).build();
	}

}

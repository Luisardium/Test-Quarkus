package com.beesion.ms.test.service.impl;

import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.repository.PersonRepo;
import com.beesion.ms.test.repository.impl.IPersonRepo;
import com.beesion.ms.test.service.IPersonService;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotFoundException;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class PersonService implements IPersonService{

	@Inject
	IPersonRepo personRepo; //Inyecta interfaz del repositorio, no repositorio directamentecomo estaba antes



	@Override
	public void save(Person per) {
		// Establece la relación entre cada Address y la Persona
		if (per.getAddresses() != null) {
			for (Address address : per.getAddresses()) {
				address.setPerson(per);
			}
		}
		personRepo.save(per);
	}



	@Override
	public List<Address> ObtenerDireccionPorID(Long personId) {
		Optional<Person> person = personRepo.findById(personId);
		if(person.isEmpty()){
			throw new NotFoundException("Persona no encontrada con ID: " + personId);
		}
		return person.get().getAddresses();
	}

	@Override
	public Person findById(Long id) {
		Optional<Person> person = personRepo.findById(id);
		if (person.isEmpty()) {
			throw new NotFoundException("Persona no encontrada con ID: " + id);
		}
		return person.get();
	}


}

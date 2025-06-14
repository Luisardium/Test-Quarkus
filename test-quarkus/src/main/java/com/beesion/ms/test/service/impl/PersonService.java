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
		personRepo.save(per);
	}



	@Override
	public List<Address> ObtenerDireccionPorID(Long personId) {
		return null;
	}




}

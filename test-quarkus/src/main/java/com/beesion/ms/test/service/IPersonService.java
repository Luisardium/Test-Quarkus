package com.beesion.ms.test.service;

import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;

import java.util.List;

public interface IPersonService {
	
	public void save(Person per);
	public List<Address> ObtenerDireccionPorID(Long personId);
	public Person findById(Long id);
}

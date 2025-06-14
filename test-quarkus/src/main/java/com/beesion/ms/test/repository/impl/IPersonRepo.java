package com.beesion.ms.test.repository.impl;

import com.beesion.ms.model.Person;

import java.util.Optional;

public interface IPersonRepo {
	
	public void save(Person per);
	Optional<Person> findById(Long id);

}

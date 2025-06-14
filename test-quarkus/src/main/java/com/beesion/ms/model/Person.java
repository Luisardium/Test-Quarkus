package com.beesion.ms.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Person {

	private Long id;
	private String name;

	@Id
	@SequenceGenerator(name = "PersonIdGenerator")
	@GeneratedValue(generator = "PersonIdGenerator")
	public Long getId() {
		return id;
	}

//	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true) //Relacion con tabla de direcciones
//	private List<Address> addresses;


}

package com.beesion.ms.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int zona;
    private String municipio;
    private String departamento;

 /*   @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person; */
}

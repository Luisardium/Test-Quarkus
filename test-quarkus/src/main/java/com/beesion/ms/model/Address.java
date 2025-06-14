package com.beesion.ms.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int zona;
    private String municipio;
    private String departamento;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    @JsonBackReference //evita ciclos
    private Person person;


}

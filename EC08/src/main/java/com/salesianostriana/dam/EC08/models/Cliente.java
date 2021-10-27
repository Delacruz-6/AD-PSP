package com.salesianostriana.dam.EC08.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity

@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Cliente {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private LocalDateTime fechaRegistro;



}

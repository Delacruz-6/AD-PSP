package com.salesianostriana.dam.SevicioBaseAbstracto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Getter@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Alumno implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String nombre, apellidos, email;


}

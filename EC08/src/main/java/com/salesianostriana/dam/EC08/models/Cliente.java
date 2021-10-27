package com.salesianostriana.dam.EC08.models;

import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;
import java.io.Serializable;
/*
 Elegi el tipo de herencia JOINED porque considero que es mas apropiado que cada clase hija
 tenga su propia tabla y herede el id de la tabla cliente, además, escogí que fuese abstracta
 dado que un cliente cuando se cree, siempre debe ser de tipo individual o corporativo no
 generalizado.
 */
@Entity @SuperBuilder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String email, nombre, apellidos, direccion;

    private Integer codigoPostal;

    public Cliente(String email, String nombre, String apellidos, String direccion, Integer codigoPostal) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
    }
}

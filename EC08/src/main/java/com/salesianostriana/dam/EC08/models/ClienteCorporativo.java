package com.salesianostriana.dam.EC08.models;

import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@Entity @SuperBuilder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class ClienteCorporativo  extends Cliente implements Serializable {

    private String nombreEmpresa;

    private String cif;

    @ManyToOne
    private Empleado empleado;

    public ClienteCorporativo(String email, String nombre, String apellidos, String direccion, Integer codigoPostal, String nombreEmpresa, String cif) {
        super(email, nombre, apellidos, direccion, codigoPostal);
        this.nombreEmpresa = nombreEmpresa;
        this.cif = cif;
    }
}

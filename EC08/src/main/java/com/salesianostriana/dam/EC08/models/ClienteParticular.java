package com.salesianostriana.dam.EC08.models;
import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.Entity;
import java.io.Serializable;


@Entity @SuperBuilder
@NoArgsConstructor  @AllArgsConstructor
@Getter @Setter
public class ClienteParticular extends Cliente implements Serializable {

    private String dni;

    public ClienteParticular(String email, String nombre, String apellidos, String direccion, Integer codigoPostal, String dni) {
        super(email, nombre, apellidos, direccion, codigoPostal);
        this.dni = dni;
    }
}

package com.salesianostriana.dam._EjercicioPractica;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Monumento{

    @Id
    @GeneratedValue
    private Long id;

    private String codigoPais;
    private String nombrePais;
    private String nombreCiudad;
    private String localizacion;
    private String nombreMonumento;
    private String descripcion;
    private String foto;

    public Monumento(String codigoPais, String nombrePais, String nombreCiudad, String localizacion,
                     String nombreMonumento, String descripcion, String foto) {
        this.codigoPais = codigoPais;
        this.nombrePais = nombrePais;
        this.nombreCiudad = nombreCiudad;
        this.localizacion = localizacion;
        this.nombreMonumento = nombreMonumento;
        this.descripcion = descripcion;
        this.foto = foto;
    }
}

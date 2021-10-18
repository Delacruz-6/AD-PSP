package com.salesianostriana.dam.UD2EC02EJ2DelacruzGuillermo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "product")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",nullable = false , length = 128)
    private String nombre;
    @Column(name = "price",nullable = false )
    private Double precio;
    @Column(name = "image" , length = 500)
    private String imagen;
    @Column(name = "description", length = 1000)
    private String descripcion;

}
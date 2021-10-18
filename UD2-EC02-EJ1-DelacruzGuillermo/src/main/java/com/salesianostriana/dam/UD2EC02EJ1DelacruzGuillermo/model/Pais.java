package com.salesianostriana.dam.UD2EC02EJ1DelacruzGuillermo.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "country")
public class Pais implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",nullable = false , length = 128)
    private String nombre;


}
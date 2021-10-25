package com.salesianostriana.dam.E07ModeloDeDatos.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Artist  implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "artista")
    private List<Song> songs;
}
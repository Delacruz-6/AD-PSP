package com.salesianostriana.dam.E07ModeloDeDatos.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Song implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String title;

    private String album;

    private String year;

    @ManyToOne
    private Artist artista;


    @Builder.Default
    @OneToMany(mappedBy = "playlist", fetch = FetchType.EAGER)
    private List<AddedTo> AddedTos = new ArrayList<>();



    /**
     * MÉTODOS AUXILIARES Ó HELPERS
     * ASOCIACION (Song/ Artist)
     */
    public void addArtista(Artist c) {
        this.artista = c;
        if (c.getSongs() == null)
            c.setSongs(new ArrayList<>());
        c.getSongs().add(this);
    }

    public void removeArtista(Artist c) {
        c.getSongs().remove(this);
        this.artista = null;
    }
}
package com.salesianostriana.dam.E07ModeloDeDatos.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Playlist implements Serializable {

    @GeneratedValue
    @Id
    @JoinColumn(name="playlist_id")
    private Long id;

    private String name, description;

    @Builder.Default
    @OneToMany(mappedBy = "playlist")
    private List<AddedTo> AddedTos = new ArrayList<>();

    public Playlist(String name, String description) {
        this.name = name;
        this.description = description;
    }


}

package com.salesianostriana.dam.E07ModeloDeDatos.repositories;

import com.salesianostriana.dam.E07ModeloDeDatos.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}

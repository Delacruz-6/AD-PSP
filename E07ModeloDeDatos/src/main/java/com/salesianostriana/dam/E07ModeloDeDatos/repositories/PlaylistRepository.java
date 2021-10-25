package com.salesianostriana.dam.E07ModeloDeDatos.repositories;

import com.salesianostriana.dam.E07ModeloDeDatos.models.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}


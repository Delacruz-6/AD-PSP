package com.salesianostriana.dam.E07ModeloDeDatos.repositories;

import com.salesianostriana.dam.E07ModeloDeDatos.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}

package com.salesianostriana.dam.E07ModeloDeDatos.repositories;

import com.salesianostriana.dam.E07ModeloDeDatos.models.AddedTo;
import com.salesianostriana.dam.E07ModeloDeDatos.models.AddedToPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, AddedToPK> {
}

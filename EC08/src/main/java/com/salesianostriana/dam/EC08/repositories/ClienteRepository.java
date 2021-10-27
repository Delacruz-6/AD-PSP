package com.salesianostriana.dam.EC08.repositories;


import com.salesianostriana.dam.EC08.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository
        extends JpaRepository<Cliente,Long> {
}

package com.salesianostriana.dam.EC08.repositories;

import com.salesianostriana.dam.EC08.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository
        extends JpaRepository<Empleado,Long> {
}

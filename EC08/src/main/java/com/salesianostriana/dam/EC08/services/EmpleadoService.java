package com.salesianostriana.dam.EC08.services;



import com.salesianostriana.dam.EC08.models.Empleado;
import com.salesianostriana.dam.EC08.repositories.EmpleadoRepository;
import com.salesianostriana.dam.EC08.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService
        extends BaseService<Empleado, Long, EmpleadoRepository> {
}

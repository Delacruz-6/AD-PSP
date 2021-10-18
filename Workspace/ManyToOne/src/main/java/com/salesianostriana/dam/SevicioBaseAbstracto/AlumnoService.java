package com.salesianostriana.dam.SevicioBaseAbstracto;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService extends  BaseService<Alumno, Long, AlumnoRepository>{

    public List<Alumno> otroMetodo(Sort sort){
        return this.repositorio.findAll(sort);
    }
}

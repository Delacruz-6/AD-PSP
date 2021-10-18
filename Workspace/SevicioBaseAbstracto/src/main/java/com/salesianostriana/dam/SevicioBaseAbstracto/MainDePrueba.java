package com.salesianostriana.dam.SevicioBaseAbstracto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final AlumnoRepository repository;

    @PostConstruct
    public void test() {

        Alumno alumno = Alumno.builder()
                .nombre("Luismi")
                .apellidos("López")
                .email("luismi.lopez@salesianos.edu")
                .build();

        repository.save(alumno);

        repository
                .findAll()
                .forEach(System.out::println);


    }

}
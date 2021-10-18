package com.salesianostriana.dam.UD2EC02EJ2DelacruzGuillermo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class PseudoMain {

    private final ProductRepository repo;


    @PostConstruct
    public void test() {

        Producto p1 = Producto.builder()
                .nombre("Realme 7 PRO")
                .precio(228.9)
                .descripcion("Smartphone de 6.4 pulgadas, 8GB RAM y 128GB almacenamiento, pantalla SuperAMOLED FHD+")
                .build();

        repo.save(p1);

        repo.findAll().forEach(System.out::println);
        }

    }
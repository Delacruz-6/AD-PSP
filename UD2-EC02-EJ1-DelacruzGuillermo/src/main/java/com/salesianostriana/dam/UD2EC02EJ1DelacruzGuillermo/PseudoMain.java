package com.salesianostriana.dam.UD2EC02EJ1DelacruzGuillermo;

import com.salesianostriana.dam.UD2EC02EJ1DelacruzGuillermo.model.Pais;
import com.salesianostriana.dam.UD2EC02EJ1DelacruzGuillermo.repositories.PaisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class PseudoMain {

    private final PaisRepository repo;

    @PostConstruct
    public void test() {
        Pais pais = Pais.builder()
                .nombre("China")
                .build();

        repo.save(pais);
        repo.findAll().forEach(System.out::println);
    }
}

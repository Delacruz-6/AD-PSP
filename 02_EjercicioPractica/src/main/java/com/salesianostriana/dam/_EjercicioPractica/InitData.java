package com.salesianostriana.dam._EjercicioPractica;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class InitData {

    private final MonumentoRepository repository;

    @PostConstruct
    public void init() {
        repository.saveAll(
                Arrays.asList(
                        new Monumento("3166-2:ES", "España", "Sevilla",
                                "37.386211395,-5.992569923", "Giralda",
                                "Giralda es el nombre que recibe la torre campanario de la catedral de Santa María de" +
                                        " la Sede de la ciudad de Sevilla, en Andalucía (España).",
                                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/La_Giralda_August_2012_" +
                                        "Seville_Spain.jpg/240px-La_Giralda_August_2012_Seville_Spain.jpg"),
                        new Monumento("3166-2:FR", "Francia", "París",
                                "48.8583701, 2.2944813", "Torre Eiffel",
                                "La torre Eiffel inicialmente llamada " +
                                        "torre de 300 metros, construida por el ingeniero francés Alexandre Gustave Eiffel y sus " +
                                        "colaboradores para la Exposición Universal de 1889 en París.",
                                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Tour_eiffel_at_sunrise_from" +
                                        "_the_trocadero.jpg/320px-Tour_eiffel_at_sunrise_from_the_trocadero.jpg")
                )
        );
    }

}
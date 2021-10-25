package com.salesianostriana.dam.E07ModeloDeDatos.services;

import com.salesianostriana.dam.E07ModeloDeDatos.models.*;
import com.salesianostriana.dam.E07ModeloDeDatos.repositories.AddedToRepository;
import com.salesianostriana.dam.E07ModeloDeDatos.services.base.BaseService;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@Builder
public class AddedToService extends
        BaseService<AddedTo, AddedToPK, AddedToRepository> {
    /*
    public Song songPlaylist(Song s, Artist a, Playlist p) {

        // 1. Obtener todas las asignaturas del curso
        // 2. Crear una nueva instancia de Notas por cada asignatura
        // 3. Insertarlas en la base de datos.

        s.getAddedTos().forEach(playlist -> {
            AddedTo n = AddedTo.builder()
                    .song(playlist)
                    .

                    .build();
            save(n);
        });

        return n;
    }

     */


}

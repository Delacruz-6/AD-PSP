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



    public Playlist PlaylistSong(Playlist p, Song s){
        p.getAddedTos().forEach(playlist -> {
            AddedTo ad = AddedTo
                    .builder()
                    .song(s)
                    .build();
            save(ad);
        });
        return p;
    }
}

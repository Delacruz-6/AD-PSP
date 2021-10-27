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

    public void createAddedTo(Playlist p, Song s, PlaylistService pService, SongService sService){
        AddedTo addedTo = AddedTo.builder()
                .build();

        addedTo.addPlaylistSong(p,s);

        save(addedTo);
        sService.save(s);
        pService.save(p);

    }

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

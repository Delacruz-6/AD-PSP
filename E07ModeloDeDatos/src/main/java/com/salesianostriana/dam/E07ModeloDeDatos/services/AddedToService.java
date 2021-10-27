package com.salesianostriana.dam.E07ModeloDeDatos.services;

import com.salesianostriana.dam.E07ModeloDeDatos.models.*;
import com.salesianostriana.dam.E07ModeloDeDatos.repositories.AddedToRepository;
import com.salesianostriana.dam.E07ModeloDeDatos.services.base.BaseService;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
@Builder
public class AddedToService extends
        BaseService<AddedTo, AddedToPK, AddedToRepository> {

    public void createAddedTo(Playlist p, Song s, PlaylistService pService, SongService sService){
        AddedTo addedTo = AddedTo.builder()
                .build();

<<<<<<< HEAD
=======
    public void createAddedTo(Playlist p, Song s, PlaylistService pService, SongService sService){
        AddedTo addedTo = AddedTo.builder()
                .orden(ThreadLocalRandom.current().nextInt())
                .date(LocalDateTime.now())
                .build();

>>>>>>> cfaa5afe59d276243ee9e9698c9d0817bc388f5b
        addedTo.addPlaylistSong(p,s);

        save(addedTo);
        sService.save(s);
        pService.save(p);
<<<<<<< HEAD

    }
=======
>>>>>>> cfaa5afe59d276243ee9e9698c9d0817bc388f5b

    }

}

package com.salesianostriana.dam.E07ModeloDeDatos;

import com.salesianostriana.dam.E07ModeloDeDatos.models.*;
import com.salesianostriana.dam.E07ModeloDeDatos.services.AddedToService;
import com.salesianostriana.dam.E07ModeloDeDatos.services.ArtistService;
import com.salesianostriana.dam.E07ModeloDeDatos.services.PlaylistService;
import com.salesianostriana.dam.E07ModeloDeDatos.services.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final PlaylistService pService;
    private final SongService sService;
    private final ArtistService aService;
    private final AddedToService addService;

    @PostConstruct
    public void test() {


        Artist artist1 = Artist.builder()
                .nombre("SFDK")
                .build();

        aService.edit(artist1);


        Song cancion1 = Song.builder()
                .title("Sevilla")
                .album("Siempre fuertes 2")
                .year("2009")
                .build();
        cancion1.addArtista(artist1);

        sService.save(cancion1);


        Playlist rap = Playlist.builder()
                .name("sdfk")
                .description("Lista de canciones de SFDK")
                .build();
        pService.save(rap);

<<<<<<< HEAD
        pService.save(rap);
        addService.PlaylistSong(rap,cancion1);
=======

        addService.createAddedTo(rap,cancion1,pService,sService);

>>>>>>> cfaa5afe59d276243ee9e9698c9d0817bc388f5b

        AddedTo add= AddedTo.builder().build();
        add.addPlaylistSong(cancion1,rap);
        addService.createAddedTo(rap,cancion1,pService,sService);
        Optional<Playlist> playlistOptional = pService.findById(1L);

        playlistOptional.ifPresent(p -> {
            System.out.println("------------------Playlist------------------");
            System.out.println("Nombre: " + p.getName());
            System.out.println("Descripcion: " + p.getDescription());
        });
        System.out.println("Nombre: " + addedTo.getOrder());
        System.out.println("Nombre: " + addedTo.getDate());
        System.out.println("Nombre: " + addedTo.getSong());
        System.out.println("Nombre: " + addedTo.getPlaylist());


        Optional<Song> songOptional = sService.findById(1L);

        songOptional.ifPresent(s -> {
            System.out.println("------------------Cancion------------------");
            System.out.println("Titulo: " + s.getTitle());
            System.out.println("Album: " + s.getAlbum());
            System.out.println("Año: " + s.getYear());
            System.out.println("Artista: " + s.getArtista().getNombre());
        });

        /*
        Optional<AddedTo> addOptional = Optional.ofNullable(addService.findAll().get(1));

        addOptional.ifPresent(a -> {
            System.out.println("------------------Agregación------------------");
            System.out.println("Fecha: " + a.getDate());
            System.out.println("Orden: " + a.getOrden());
            System.out.println("Titulo cancion: " + a.getSong().getTitle());
            System.out.println("Nombre Playlist: " + a.getPlaylist().getName());
        });

         */


    }

}
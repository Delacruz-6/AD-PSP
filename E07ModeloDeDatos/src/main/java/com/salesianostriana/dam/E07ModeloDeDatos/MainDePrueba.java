package com.salesianostriana.dam.E07ModeloDeDatos;

import com.salesianostriana.dam.E07ModeloDeDatos.models.AddedTo;
import com.salesianostriana.dam.E07ModeloDeDatos.models.Artist;
import com.salesianostriana.dam.E07ModeloDeDatos.models.Playlist;
import com.salesianostriana.dam.E07ModeloDeDatos.models.Song;
import com.salesianostriana.dam.E07ModeloDeDatos.services.AddedToService;
import com.salesianostriana.dam.E07ModeloDeDatos.services.ArtistService;
import com.salesianostriana.dam.E07ModeloDeDatos.services.PlaylistService;
import com.salesianostriana.dam.E07ModeloDeDatos.services.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final PlaylistService pService;
    private final SongService sService;
    private final ArtistService aService;
    private final AddedToService addService;
    private Object LocalDateTime;

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
                .artista(artist1)
                .build();

        sService.save(cancion1);

        Playlist rap = Playlist.builder()
                .name("sdfk")
                .description("Lista de canciones de SFDK")
                .build();

        List<AddedTo> addedToList = List.of(
                AddedTo.builder().date(LocalDate.now()).order("1º").playlist(rap).song(cancion1).build()
        );

        for (int i = 0; i < addedToList.size(); i++){
            addedToList.get(i).addToSongs(cancion1);
        }

        addService.saveAll(addedToList);


        Optional<Playlist> playlistOptional = pService.findById(1L);

        playlistOptional.ifPresent(p -> {
            System.out.println("--------------Playlist--------------");
            System.out.println("Nombre: " + p.getName());
            System.out.println("Descripcion: " + p.getDescription());
        });

    }

}
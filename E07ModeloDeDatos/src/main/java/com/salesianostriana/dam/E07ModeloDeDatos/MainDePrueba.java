package com.salesianostriana.dam.E07ModeloDeDatos;

import com.salesianostriana.dam.E07ModeloDeDatos.models.Artist;
import com.salesianostriana.dam.E07ModeloDeDatos.models.Song;
import com.salesianostriana.dam.E07ModeloDeDatos.repositories.PlaylistRepository;
import com.salesianostriana.dam.E07ModeloDeDatos.services.AddedToService;
import com.salesianostriana.dam.E07ModeloDeDatos.services.ArtistService;
import com.salesianostriana.dam.E07ModeloDeDatos.services.PlaylistService;
import com.salesianostriana.dam.E07ModeloDeDatos.services.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final PlaylistService pService;
    private final SongService sService;
    private final ArtistService aService;
    private final AddedToService addService;

    @PostConstruct
    public void test() {


        Artist artist = Artist.builder()
                .nombre("SFDK")
                .build();

        aService.edit(artist);


        Song cancion1 = Song.builder()
                .nombre("2º DAM")
                .tutor("Luismi")
                .build();

        cursoService.save(dam2);

        List<Asignatura> asignaturas = List.of(
                Asignatura.builder().nombre("PSP").profesor("Luismi").build(),
                Asignatura.builder().nombre("EIE").profesor("Jesús").build(),
                Asignatura.builder().nombre("PMDM").profesor("Miguel").build()
        );

        for(int i = 0; i < asignaturas.size(); i++){
            asignaturas.get(i).addToCurso(dam2);
        }

        asignaturaService.saveAll(asignaturas);


        /*
        Asignatura asignatura = Asignatura.builder()
                .nombre("AD")
                .profesor("Luismi")
                .alumnos(new ArrayList<>())
                .build();
        asignaturaService.save(asignatura);
        List<Alumno> nuevosAlumnos = List.of(
          Alumno.builder().nombre("Alejandro").asignaturas(new ArrayList<>()).build(),
          Alumno.builder().nombre("Cynthia").asignaturas(new ArrayList<>()).build(),
          Alumno.builder().nombre("Pablo").asignaturas(new ArrayList<>()).build(),
          Alumno.builder().nombre("Manuel").asignaturas(new ArrayList<>()).build()
        );
        nuevosAlumnos.forEach(nuevoAlumno -> nuevoAlumno.addAsignatura(asignatura));
        alumnoService.saveAll(nuevosAlumnos);
        */

        alumno = notasService.matriculaCurso(alumno, dam2);





    }

}
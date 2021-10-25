package com.salesianostriana.dam.E07ModeloDeDatos.services;


import com.salesianostriana.dam.E07ModeloDeDatos.models.Song;
import com.salesianostriana.dam.E07ModeloDeDatos.repositories.SongRepository;
import com.salesianostriana.dam.E07ModeloDeDatos.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService
        extends BaseService<Song, Long, SongRepository> {


}

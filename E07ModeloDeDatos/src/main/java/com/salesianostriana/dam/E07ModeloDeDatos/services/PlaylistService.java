package com.salesianostriana.dam.E07ModeloDeDatos.services;

import com.salesianostriana.dam.E07ModeloDeDatos.models.Playlist;
import com.salesianostriana.dam.E07ModeloDeDatos.models.Song;
import com.salesianostriana.dam.E07ModeloDeDatos.repositories.PlaylistRepository;
import com.salesianostriana.dam.E07ModeloDeDatos.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService
        extends BaseService<Playlist, Long, PlaylistRepository> {


}
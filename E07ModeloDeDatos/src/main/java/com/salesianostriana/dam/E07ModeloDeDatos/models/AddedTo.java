package com.salesianostriana.dam.E07ModeloDeDatos.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddedTo implements Serializable {


    @Builder.Default
    @EmbeddedId
    private AddedToPK id = new AddedToPK();

    @ManyToOne
    @MapsId("plalist_id")
    @JoinColumn(name="playlist_id")
    private Playlist playlist;

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;

    private Date dateTime;

    private String order;


    /*
        HELPERS
     */

    public void addToSongs(Song a) {
        song = a;
        a.getAddedTos().add(this);
    }

    public void removeFromSong(Song a) {
        a.getAddedTos().remove(this);
        song = null;
    }

    public void addToPlaylist(Playlist a) {
        playlist = a;
        a.getAddedTos().add(this);
    }

    public void removeFromPlaylist(Playlist a) {
        a.getAddedTos().remove(this);
        playlist = null;
    }

    public void addPlaylistSong(Playlist playlist, Song song) {
        addToSongs(song);
        addToPlaylist(playlist);
    }

    public void removePlaylistSong(Playlist playlist, Song song) {
        removeFromSong(song);
        removeFromPlaylist(playlist);
    }



}
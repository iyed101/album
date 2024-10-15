package com.iyed.album.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlbum;
    private String name;
    private Date Date_sortie;
    private String genre;
    private int nb_tracks;
    @ManyToOne  
    private Artist artist;
    public Album() {
        super();
    }
    
    public Album(String name, Date date_sortie, String genre, int nb_tracks) {
        this.name = name;
        Date_sortie = date_sortie;
        this.genre = genre;
        this.nb_tracks = nb_tracks;
    }

    public Long getIdAlbum() {
        return idAlbum;
    }
    public void setIdAlbum(Long idAlbum) {
        this.idAlbum = idAlbum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDate_sortie() {
        return Date_sortie;
    }
    public void setDate_sortie(Date date_sortie) {
        Date_sortie = date_sortie;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getNb_tracks() {
        return nb_tracks;
    }
    public void setNb_tracks(int nb_tracks) {
        this.nb_tracks = nb_tracks;
    }

    @Override
    public String toString() {
        return "Album [idAlbum=" + idAlbum + ", name=" + name + ", Date_sortie=" + Date_sortie + ", genre=" + genre
                + ", nb_tracks=" + nb_tracks + "]";
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
    
}

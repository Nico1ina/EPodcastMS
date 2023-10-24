package com.example.eurekapodcastserver.models;

import jakarta.persistence.*;

@Entity
@Table(name = "podhosts")
public class Podhost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "podhost_id", nullable = false)
    private int id;

    @Column(name = "podhost_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "media_type_id")
    private MediaType mediaType;


    public Podhost(){
    }

    public Podhost(int id, String name, Genre genre, MediaType mediaType) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.mediaType = mediaType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    /*    public List<Episode> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(List<Episode> episodeList) {
        this.episodeList = episodeList;
    }*/
}

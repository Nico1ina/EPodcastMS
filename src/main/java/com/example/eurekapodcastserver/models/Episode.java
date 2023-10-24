package com.example.eurekapodcastserver.models;

import jakarta.persistence.*;

@Entity
@Table(name = "episodes")
public class Episode extends Media {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "season_id")
    private Season season;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "podhost_id")
    private Podhost podhost;

    public Episode(){
    }

    public Episode(Season season) {
        this.season = season;
    }

    public Episode(int id, String name, Genre genre, String releaseDate, MediaType mediaType, String url, Season season) {
        super(id, name, genre, releaseDate, mediaType, url);
        this.season = season;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Genre getGenre() {
        return super.getGenre();
    }

    @Override
    public void setGenre(Genre genre) {
        super.setGenre(genre);
    }

    @Override
    public String getReleaseDate() {
        return super.getReleaseDate();
    }

    @Override
    public void setReleaseDate(String releaseDate) {
        super.setReleaseDate(releaseDate);
    }

    @Override
    public MediaType getMediaType() {
        return super.getMediaType();
    }

    @Override
    public void setMediaType(MediaType mediaType) {
        super.setMediaType(mediaType);
    }

    @Override
    public String getUrl() {
        return super.getUrl();
    }

    @Override
    public void setUrl(String url) {
        super.setUrl(url);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}

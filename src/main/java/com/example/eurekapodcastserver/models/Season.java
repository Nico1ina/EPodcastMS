package com.example.eurekapodcastserver.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "seasons")
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "season_id", nullable = false)
    private int id;

    @Column(name = "season_name")
    private String title;

    @Column(name = "release_date")
    private String releaseDate;

    @OneToMany(mappedBy = "season", cascade = CascadeType.ALL)
    private List<Episode> episodeList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "podhost_id")
    private Podhost podhost;

    public Season() {
    }

    public Season(int id, String title, String releaseDate, List<Episode> episodeList, Podhost podhost) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.episodeList = episodeList;
        this.podhost = podhost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Episode> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(List<Episode> episodeList) {
        this.episodeList = episodeList;
    }

    public Podhost getPodhost() {
        return podhost;
    }

    public void setPodhost(Podhost podhost) {
        this.podhost = podhost;
    }
}

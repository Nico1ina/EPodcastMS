package com.example.eurekapodcastserver.services;

import com.example.eurekapodcastserver.models.Episode;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodeServiceInterface {

    Episode getEpisodeByName(String episodeName);

    Episode updateEpisode(Episode episode, int id);
/*
    List<Episode> getEpisodeByPodhost(String episodeName);*/
}

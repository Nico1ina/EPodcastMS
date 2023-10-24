package com.example.eurekapodcastserver.services;

import com.example.eurekapodcastserver.models.Episode;
import com.example.eurekapodcastserver.repositories.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodeService implements EpisodeServiceInterface {
    @Autowired
    private EpisodeRepository episodeRepository;

    public EpisodeService() {
    }
    @Override
    public Episode getEpisodeByName(String episodeName) {
        return episodeRepository.findEpisodeByNameContainsIgnoreCase(episodeName);
    }


  @Override
    public Episode updateEpisode(Episode episode, int id) {
        Episode e = episodeRepository.findById(id).orElseThrow();
       // e.setArtist(e.getArtist());
        e.setGenre(e.getGenre());
        e.setName(e.getName());
        e.setMediaType(e.getMediaType());
        e.setReleaseDate(e.getReleaseDate());
        episodeRepository.save(e);
        return e;
    }

  /* @Override
    public List<Episode> getEpisodeByPodhost(String podhostName) {
        return episodeRepository.findTrackByPodhostContainingIgnoreCase(podhostName);
    }*/

    public List<Episode> getAllEpisodes(){
        return episodeRepository.findAll();
    }

    public Optional<Episode> getEpisodeById(int id){
        return episodeRepository.findById(id);
    }

    public Episode saveEpisode(Episode newEpisode){
        return episodeRepository.save(newEpisode);
    }

    public String deleteEpisode(int id){
        Optional<Episode> optionalEpisode = episodeRepository.findById(id);
        if(optionalEpisode.isPresent()){
            episodeRepository.deleteById(id);
            return "Episode was successfully deleted";
        }
        return "An episode with that ID could not be found.";
    }

    public List<Episode> findEpisodeByGenre(String genreName){
        return episodeRepository.findEpisodeByGenreContainingIgnoreCase(genreName);
    }

}

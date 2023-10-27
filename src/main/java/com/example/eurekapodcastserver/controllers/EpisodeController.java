package com.example.eurekapodcastserver.controllers;

import com.example.eurekapodcastserver.models.Episode;
import com.example.eurekapodcastserver.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/podcast")
public class EpisodeController {
    @Autowired
    private EpisodeService episodeService;

    public EpisodeController() {
    }

    @GetMapping("/track/getepisodebyname/{episodeName}")
    public Episode getEpisodeByName(@PathVariable("episodeName") String episodeName){
        return episodeService.getEpisodeByName(episodeName);
    }

    @GetMapping("/episodes/getall")
    public List<Episode> getAllAllEpisodes(){
        return episodeService.getAllEpisodes();
    }

    @GetMapping("/episode/getbyid/{id}")
    public Optional<Episode> episodeById(@PathVariable("id") int id){
        return episodeService.getEpisodeById(id);
    }

    @PostMapping("/episode/add")
    public Episode saveTrack(Episode newEpisode){
        return episodeService.saveEpisode(newEpisode);
    }

    @DeleteMapping("/episode/delete/{id}")
    public String deleteEpisode(@PathVariable("id") int id){
        return episodeService.deleteEpisode(id);
    }

    @GetMapping("/episode/bygenre/{genreName}")
    public List<Episode> findEpisodeByGenre(@PathVariable("genreName")String genreName){
        genreName = genreName.replace("-", " ").replace("+", " ").replace("%", " ");
        return episodeService.findEpisodeByGenre(genreName);
    }

    @PutMapping("/track/updateEpisode/{id}")
    public ResponseEntity<Episode> updateEpisode(@PathVariable("id")int id, @RequestBody Episode episode) {
        return ResponseEntity.ok(episodeService.updateEpisode(episode, id));
    }
}

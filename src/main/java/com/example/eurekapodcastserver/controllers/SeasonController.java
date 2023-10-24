package com.example.eurekapodcastserver.controllers;

import com.example.eurekapodcastserver.models.Season;
import com.example.eurekapodcastserver.repositories.SeasonRepository;
import com.example.eurekapodcastserver.services.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/podcast/api/v1/")
public class SeasonController {

    @Autowired
    private SeasonService seasonService;
    @Autowired
    private SeasonRepository seasonRepository;

    public SeasonController() {
    }

  /*  @GetMapping("/season/seasonByTrackName/{trackName}")
    public Season getSeasonByEpisodeName(@PathVariable("episodeName") String episodeName){
        return seasonService.findSeasonByEpisodeName(episodeName);}*/

   /* @GetMapping("/season/seasonByArtistName/{artistName}")
    public List<Season> getSeasonsByPodhostName(@PathVariable("podhostName") String podhostName) {
        return seasonService.findSeasonsByPodhostName(podhostName);
    }*/

  /*  @GetMapping("/season/searchByName/{albumTitle}")
    public Season getSeasonByTitle(@PathVariable("seasonTitle") String seasonTitle){
        return seasonService.getSeasonByTitle(seasonTitle);
    }*/

    @GetMapping("/season/getAll")
    public List<Season> getAllSeasons(){
        return seasonService.getAllSeasons();
    }

    @GetMapping("/season/getById/{id}")
    public Optional<Season> seasonById(@PathVariable("id") int id){
        return seasonService.SeasonById(id);
    }

    @PostMapping("/season/add")
    public Season saveSeason(Season newSeason){
        return seasonService.saveSeason(newSeason);
    }

    @DeleteMapping("/season/delete/{id}")
    public String deleteSeason(@PathVariable("id") int id){
        return seasonService.deleteSeason(id);
    }

    @PutMapping("/season/update/{id}")
    public ResponseEntity<Season> updateSeason(@PathVariable("id") int id, @RequestBody Season season){
        return ResponseEntity.ok(seasonService.updateSeason(season, id));
    }
}
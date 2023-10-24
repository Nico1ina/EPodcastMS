package com.example.eurekapodcastserver.controllers;

import com.example.eurekapodcastserver.models.Podhost;
import com.example.eurekapodcastserver.services.EpisodeService;
import com.example.eurekapodcastserver.services.PodhostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/podcast/api/v1")
public class PodhostController {

    @Autowired
    private PodhostService podhostService;

    @Autowired
    private EpisodeService episodeService;

    public PodhostController(PodhostService podhostService) {
        this.podhostService = podhostService;
    }

    @GetMapping("/podhost/getall")
    public List<Podhost> getAllAllPodhosts(){
        return podhostService.getAllPodhosts();
    }

    @GetMapping("/podhost/getbyid/{id}")
    public Optional<Podhost> podhostById(@PathVariable("id") int id){
        return podhostService.getPodhostsById(id);
    }

    //get artists by genre-id
    @GetMapping ("/podhost/getpodhostbygenre/{id}")

    public List<Podhost> getPodhostsByGenreId(@PathVariable("id") int id) {
        return podhostService.getPodhostsByGenre(id); }

    @GetMapping("/podhost/bygenre/{genreName}")
    public List<Podhost> getPodhostsByGenreName (@PathVariable("genreName") String genreName){
        return podhostService.getPodhostsByGenreName(genreName);
    }

    @PostMapping("/podhost/add")
    public Podhost savePodhost(Podhost newPodhost){
        return podhostService.createPodhost(newPodhost);
    }

    @PutMapping("/podhost/update/{id}")
    public ResponseEntity<Podhost> updatePodhost(@PathVariable("id")int id, @RequestBody Podhost podhost) {
        return ResponseEntity.ok(podhostService.updatePodhost(podhost, id));
    }

    @DeleteMapping("/podhost/delete/{id}")
    public void deletePodhost(@PathVariable("id") int id){
        podhostService.deletePodhost(id);
    }

    @GetMapping("/podhost/searchbyname/{podhost}")
    public List<Podhost> findByName(@PathVariable("podhost") String podhost){
        podhost = podhost.replace("-", " ").replace("+", " ").replace("%", " ");
        return podhostService.getPodhostsByName(podhost);
    }

  /*  @GetMapping("/artist/findepisodes/{podhostName}")
    public List<Podhost> findEpisodeByPodhost(@PathVariable("podhostName")String podhostName){
        podhostName = podhostName.replace("-", " ").replace("+", " ").replace("%", " ");
        return podhostService.getEpisodeByPodhost(podhostName);
    }*/


}

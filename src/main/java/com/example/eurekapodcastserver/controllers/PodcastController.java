package com.example.eurekapodcastserver.controllers;

import com.example.eurekapodcastserver.models.Podcast;
import com.example.eurekapodcastserver.repositories.PodcastRepository;
import com.example.eurekapodcastserver.services.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/podcast/api/v1/")
public class PodcastController {

    @Autowired
    private PodcastService podcastService;
    @Autowired
    private PodcastRepository podcastRepository;


    @PostMapping("/add")
    public ResponseEntity<Podcast> savePodcast(@RequestBody Podcast podcast){
        return new ResponseEntity<Podcast>(podcastService.savePodcast(podcast), HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    public List<Podcast> getAllPodcasts(){
        return podcastService.getAllPodcasts();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Podcast> updatePodcast(@PathVariable("id") int ID, @RequestBody Podcast podcast){
        return ResponseEntity.ok(podcastService.updatePodcast(podcast, ID));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePodcast(@PathVariable ("id") int ID){
        podcastService.deletePodcast(ID);
        return new ResponseEntity<String>("Podcast was successfully deleted", HttpStatus.OK);
    }
}

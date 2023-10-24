package com.example.eurekapodcastserver.services;

import com.example.eurekapodcastserver.models.Podhost;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PodhostServiceInterface {

    List<Podhost> getAllPodhosts();

    Optional<Podhost> getPodhostsById(int id);


    List<Podhost> getPodhostsByName(String name);

    List<Podhost> getPodhostsByGenre(int id);


    List<Podhost> getPodhostsByGenreName(String genreName);

    Podhost createPodhost(Podhost podhostToCreate);

    Podhost updatePodhost(Podhost podhost, int id);

    void deletePodhost(int id);

}

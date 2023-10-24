package com.example.eurekapodcastserver.services;

import com.example.eurekapodcastserver.models.Genre;
import com.example.eurekapodcastserver.models.Podhost;
import com.example.eurekapodcastserver.repositories.EpisodeRepository;
import com.example.eurekapodcastserver.repositories.GenreRepository;
import com.example.eurekapodcastserver.repositories.PodhostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PodhostService implements PodhostServiceInterface {

    private PodhostRepository podhostRepository;
    private GenreRepository genreRepository;
    private final EpisodeRepository episodeRepository;


    public PodhostService(PodhostRepository podhostRepository, GenreRepository genreRepository,
                          EpisodeRepository episodeRepository) {
        this.podhostRepository = podhostRepository;
        this.genreRepository = genreRepository;
        this.episodeRepository = episodeRepository;
    }

    @Override
    public List<Podhost> getAllPodhosts() {
        return podhostRepository.findAll();
    }

    @Override
    public Optional<Podhost> getPodhostsById(int id) {
        return podhostRepository.findById(id);
    }

    @Override
    public List<Podhost> getPodhostsByName(String podhost) {
        return podhostRepository.findPodhostByNameContainingIgnoreCase(podhost);
    }

    @Override
    public List<Podhost> getPodhostsByGenre(int id) {
        return podhostRepository.findPodhostsByGenre_Id(id);
    }

    @Override
    public List<Podhost> getPodhostsByGenreName(String genreName) {
        Genre g = genreRepository.findByGenreNameContainingIgnoreCaseOrderById(genreName);
        return podhostRepository.findPodhostsByGenre_Id(g.getId());
    }


    @Override
    public Podhost createPodhost(Podhost podhostToCreate) {
        return podhostRepository.save(podhostToCreate);
    }

    @Override
    public Podhost updatePodhost(Podhost podhost, int id) {
        Podhost p = podhostRepository.findById(id).orElseThrow(() -> new RuntimeException());
        p.setName(podhost.getName());
        p.setGenre(podhost.getGenre());
        return p;
    }

    @Override
    public void deletePodhost(int id) {
        podhostRepository.deleteById(id);
        }
    }
package com.example.eurekapodcastserver.services;

import com.example.eurekapodcastserver.exceptions.ResourceNotFoundException;
import com.example.eurekapodcastserver.models.Genre;
import com.example.eurekapodcastserver.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService implements GenreServiceInterface {

    @Autowired
    private GenreRepository genreRepository;


    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public void deleteGenre(int id) {
        genreRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Genre", "id", id));
        genreRepository.deleteById(id);
    }

    @Override
    public List<Genre> findByGenre(String genre) {

        return genreRepository.findByGenreNameContainingIgnoreCase(genre);

    }

    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    @Override
    public Genre updateGenre(Genre genre, int id) {
        Genre g = genreRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Genre", "id", id));
        g.setGenreName(genre.getGenreName());
        genreRepository.save(g);

        return g;
    }
}

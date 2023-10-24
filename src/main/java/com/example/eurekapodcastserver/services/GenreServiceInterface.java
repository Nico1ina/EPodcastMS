package com.example.eurekapodcastserver.services;

import com.example.eurekapodcastserver.models.Genre;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreServiceInterface {

    Genre saveGenre(Genre genre);

    List<Genre> getAllGenres();

    Genre updateGenre(Genre genre, int id);

    void deleteGenre(int id);

    List<Genre> findByGenre(String genre);
}

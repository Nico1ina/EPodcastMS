package com.example.eurekapodcastserver.repositories;

import com.example.eurekapodcastserver.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {
    List<Genre> findByGenreNameContainingIgnoreCase(@Param("genre") String genre);
    Genre findByGenreNameContainingIgnoreCaseOrderById(@Param("genreName") String genreName);
}

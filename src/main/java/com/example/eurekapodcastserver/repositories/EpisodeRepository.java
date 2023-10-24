package com.example.eurekapodcastserver.repositories;

import com.example.eurekapodcastserver.models.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, Integer> {

    Episode findEpisodeByNameContainsIgnoreCase(@Param("episodeName") String episodeName);

    Episode findEpisodeById(@Param("episodeId") int episodeId);

    @Query("SELECT a FROM Episode a JOIN a.genre genre WHERE genre.genreName = :genreName")
    List<Episode> findEpisodeByGenreContainingIgnoreCase(@Param("genreName") String genreName);

 /*  @Query("SELECT a FROM Episode a JOIN a.podhost artist WHERE podhost.name = :podhost_Name")
    List<Episode> findEpisodeByPodhostContainingIgnoreCase(@Param("podhost_Name")String podhost_Name);
}*/
}
package com.example.eurekapodcastserver.repositories;

import com.example.eurekapodcastserver.models.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Integer> {

 //   Season findSeasonByEpisodeContainsIgnoreCase(@Param("seasonTitle") String seasonTitle);

  /*@Query("SELECT a FROM Season a JOIN a.podhost podhost WHERE podhost.name = :podhostName")
    List<Season> findSeasonsByPodhostName(@Param("podhostName") String podhostName);
    @Query("SELECT a FROM Season a JOIN a.episodeList episode WHERE episode.name = :episodeName")
    Season findSeasonByEpisodeName(@Param("episodeName") String episodeName);


    Object findAlbumsByPodhostsName(String podhostName);*/
}

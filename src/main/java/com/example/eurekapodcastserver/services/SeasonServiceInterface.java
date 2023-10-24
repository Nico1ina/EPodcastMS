package com.example.eurekapodcastserver.services;

import com.example.eurekapodcastserver.models.Season;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeasonServiceInterface {

  //  Season getSeasonByTitle(String seasonTitle);

  //  List<Season> findSeasonsByPodhostName(String podhostName);

    /*Season findSeasonByEpisodeName(String episodeName);*/

    Season updateSeason(Season season, int id);
}

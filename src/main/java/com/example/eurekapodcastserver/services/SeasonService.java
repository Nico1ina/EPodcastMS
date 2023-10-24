package com.example.eurekapodcastserver.services;

import com.example.eurekapodcastserver.models.Season;
import com.example.eurekapodcastserver.repositories.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeasonService implements SeasonServiceInterface {

    @Autowired
    private SeasonRepository seasonRepository;

    public SeasonService() {
    }

  /*  @Override
    public Season findSeasonByEpisodeName(String episodeName) {
        return seasonRepository.findSeasonByEpisodeName(episodeName);
    }*/

    @Override
    public Season updateSeason(Season season, int id) {
        Season s = seasonRepository.findById(id).orElseThrow();
        s.setPodhost(s.getPodhost());
        s.setTitle(s.getTitle());
        s.setReleaseDate(s.getReleaseDate());
        seasonRepository.save(s);
        return s;
    }


    /*public List<Season> findSeasonsByPodhostName(String podhostName) {
        return  compareDatesService.sortReleaseDates(
                seasonRepository.findAlbumsByPodhostsName(podhostName),
                Season::getReleaseDate);
    }*/

  /*  @Override
    public Season getSeasonByTitle(String seasonTitle) {
        return seasonRepository.findSeasonByEpisodeContainsIgnoreCase(seasonTitle);
    }*/

    public List<Season> getAllSeasons(){
        return seasonRepository.findAll();
    }

    public Optional<Season> SeasonById(int id){
        return seasonRepository.findById(id);
    }

    public Season saveSeason(Season newSeason){
        return seasonRepository.save(newSeason);
    }

    public String deleteSeason(int id){
        Optional<Season> optionalSeason = seasonRepository.findById(id);

        if(optionalSeason.isPresent()){
            seasonRepository.deleteById(id);
            return "Season was successfully deleted!";
        }
        return "A season with that ID could not be found.";
    }
}

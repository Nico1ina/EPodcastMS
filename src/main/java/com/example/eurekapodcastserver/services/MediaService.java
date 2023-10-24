package com.example.eurekapodcastserver.services;

import com.example.eurekapodcastserver.repositories.EpisodeRepository;
import com.example.eurekapodcastserver.repositories.GenreRepository;
import com.example.eurekapodcastserver.repositories.MediaTypeRepository;
import com.example.eurekapodcastserver.repositories.PodhostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaService {
    @Autowired
    private EpisodeRepository episodeRepository;

    @Autowired
    private PodhostRepository podhostRepository;

    @Autowired
    private MediaTypeRepository mediaTypeRepository;

    @Autowired
    private GenreRepository genreRepository;
/*
    public List<MediaInterface> getAllMedia() {
        List<Track> allTracks = trackRepository.findAll();
        List<Video> allVideos = videoRepository.findAll();

        Set<MediaInterface> set = new LinkedHashSet<>(allTracks);
        set.addAll(allVideos);
        ArrayList<MediaInterface> allMedia = new ArrayList<>(set);
        return allMedia;
    }

    public List<MediaInterface> allMediaByMediaType(String type) {

        MediaType mediaType = mediaTypeRepository.findMediaTypeByType(type);
        Set<MediaInterface> set = new LinkedHashSet<>();

        List<MediaInterface> artistCC = artistRepository.findAllByMediaType(mediaType);
        List<MediaInterface> podHostCC = podhostRepository.findAllByMediaType(mediaType);
        List<MediaInterface> videoMI = videoRepository.findAllByMediaType(mediaType);

        set.addAll(artistCC);
        set.addAll(podHostCC);
        set.addAll(videoMI);

        ArrayList<MediaInterface> allMedia = new ArrayList<>(set);
        return allMedia;
    }
*/
}

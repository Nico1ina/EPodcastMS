package com.example.eurekapodcastserver.repositories;

import com.example.eurekapodcastserver.models.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastRepository extends JpaRepository<Podcast, Integer> {
}

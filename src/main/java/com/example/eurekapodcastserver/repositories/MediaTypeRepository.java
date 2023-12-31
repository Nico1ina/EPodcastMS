package com.example.eurekapodcastserver.repositories;

import com.example.eurekapodcastserver.models.MediaType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaTypeRepository extends JpaRepository<MediaType, Integer> {
}

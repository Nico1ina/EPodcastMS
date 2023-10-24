package com.example.eurekapodcastserver.repositories;

import com.example.eurekapodcastserver.models.Podhost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PodhostRepository extends JpaRepository<Podhost, Integer> {
    List<Podhost>  findPodhostByNameContainingIgnoreCase(@Param("artist") String artist);

    List<Podhost> findPodhostsByGenre_Id(@Param("id") int id);


}

package com.example.eurekapodcastserver.controllers;

import com.example.eurekapodcastserver.models.Genre;
import com.example.eurekapodcastserver.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/podcast/api/v1/genres")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @PostMapping("/genre/add")
    public ResponseEntity<Genre> saveCustomer(@RequestBody Genre genre) {

        return new ResponseEntity<>(genreService.saveGenre(genre), HttpStatus.CREATED);
    }

    @GetMapping("/genre/getall")
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }

    @PutMapping("/genre/update")
    public ResponseEntity<Genre> updateGenre(@PathVariable("id") int id, @RequestBody Genre genre) {

        return ResponseEntity.ok(genreService.updateGenre(genre, id));
    }

    @DeleteMapping("/genre/delete/{id}")
    public ResponseEntity<String> deleteGenre(@PathVariable("id") int id) {
        genreService.deleteGenre(id);

        return new ResponseEntity<String>("Genre was successfully deleted!", HttpStatus.OK);
    }

    @GetMapping("/genre/searchbyname/{genre}")
    public List<Genre> findByGenre(@PathVariable("genre") String genre){
        genre = genre.replace("-", " ").replace("+", " ").replace("%", " ");
        return genreService.findByGenre(genre);
    }
}

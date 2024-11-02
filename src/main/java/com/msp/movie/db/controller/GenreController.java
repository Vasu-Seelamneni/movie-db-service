package com.msp.movie.db.controller;

import com.msp.movie.db.model.Genre;
import com.msp.movie.db.service.GenreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

    private static final Logger log = LoggerFactory.getLogger(GenreController.class);
    private final GenreService genreService;

    @Autowired
    // At this point if you have 2 implementations for the same interface it will not work.
    // Instead you need to use @Qualifier or @Primary or @Profile or @Lazy to identify which one to use at runtime
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/all")
    public List<Genre> getAllGenres() {
        log.info("Get all genres");
        return genreService.findAll();
    }

    @PostMapping("/save")
    public Genre saveGenre(@RequestBody Genre genre) {
        log.info("Saved a genre");
        return genreService.save(genre);
    }

    @GetMapping("/find/{id}")
    public Genre findGenreById(@PathVariable Long id) {
        log.info("Searched a genre");
        return genreService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGenre(@PathVariable Long id) {
        log.info("Deleted a genre");
        genreService.deleteGenre(id);
    }
}

package com.msp.movie.db.controller;

import com.msp.movie.db.model.MovieActor;
import com.msp.movie.db.model.MovieActorId;
import com.msp.movie.db.service.MovieActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movieactors")
public class MovieActorController {

    private final MovieActorService movieActorService;

    @Autowired
    public MovieActorController(MovieActorService movieActorService) {
        this.movieActorService = movieActorService;
    }

    @GetMapping("/all")
    public List<MovieActor> findAll() {
        return movieActorService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable MovieActorId id) {
        movieActorService.deleteMovieActor(id);
    }

    @GetMapping("/find/{id}")
    public MovieActor findById(@PathVariable MovieActorId id) {
        return movieActorService.findById(id);
    }

    @PostMapping("/save")
    public void saveMovieActor(@RequestBody MovieActor movieActor) {
        movieActorService.save(movieActor);
    }
}

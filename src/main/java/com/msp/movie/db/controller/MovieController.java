package com.msp.movie.db.controller;

import com.msp.movie.db.model.Movie;
import com.msp.movie.db.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/all")
    public List<Movie> getAllMovies() {
        return movieService.findAll();
    }

    @GetMapping("/find/{id}")
    public Movie findMovieById(@PathVariable Long id) {
        return movieService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
    }

    @PostMapping("/save")
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

}

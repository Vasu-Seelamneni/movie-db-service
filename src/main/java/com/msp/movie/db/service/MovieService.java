package com.msp.movie.db.service;

import com.msp.movie.db.model.Movie;

import java.util.List;

public interface MovieService {

    public Movie save(Movie movie);

    public Movie findById(Long movieId);

    public List<Movie> findAll();

    public void deleteMovie(Long id);
}

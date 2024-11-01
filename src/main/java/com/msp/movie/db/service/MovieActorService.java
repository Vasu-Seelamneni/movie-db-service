package com.msp.movie.db.service;

import com.msp.movie.db.model.MovieActor;
import com.msp.movie.db.model.MovieActorId;

import java.util.List;

public interface MovieActorService {

    public void save(MovieActor movieActor);

    public List<MovieActor> findAll();

    public void deleteMovieActor(MovieActorId id);

    public MovieActor findById(MovieActorId id);

}

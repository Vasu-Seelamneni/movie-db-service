package com.msp.movie.db.service.impl;

import com.msp.movie.db.model.MovieActor;
import com.msp.movie.db.model.MovieActorId;
import com.msp.movie.db.repository.MovieActorRepository;
import com.msp.movie.db.service.MovieActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieActorServiceImpl implements MovieActorService {

    private final MovieActorRepository movieActorRepository;

    @Autowired
    public MovieActorServiceImpl(MovieActorRepository movieActorRepository) {
        this.movieActorRepository = movieActorRepository;
    }

    @Override
    public void save(MovieActor movieActor) {
        movieActorRepository.save(movieActor);
    }

    @Override
    public List<MovieActor> findAll() {
        return movieActorRepository.findAll();
    }

    @Override
    public void deleteMovieActor(MovieActorId id) {
        movieActorRepository.deleteById(id);
    }

    @Override
    public MovieActor findById(MovieActorId id) {
        return movieActorRepository.findById(id).orElse(null);
    }
}

package com.msp.movie.db.repository;

import com.msp.movie.db.model.MovieActor;
import com.msp.movie.db.model.MovieActorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieActorRepository extends JpaRepository<MovieActor, MovieActorId> {
}

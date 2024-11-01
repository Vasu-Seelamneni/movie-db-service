package com.msp.movie.db.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Embeddable
public class MovieActorId {

    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "actor_id")
    private Long actorId;

}

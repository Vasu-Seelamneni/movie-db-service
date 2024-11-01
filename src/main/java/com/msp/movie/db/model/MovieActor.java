package com.msp.movie.db.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "movie_actors")
@Table(name = "movie_actors")
public class MovieActor {

    @EmbeddedId
    private MovieActorId id;

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "movie_id", insertable = false, updatable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "actor_id", referencedColumnName = "person_id", insertable = false, updatable = false)
    private Person actor;

    @Column(name = "role")
    private String role;

}

package com.msp.movie.db.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "release_year")
    private Integer releaseYear;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "synopsis")
    private String synopsis;

    @ManyToOne
    @JoinColumn(name = "genre_id", referencedColumnName = "genre_id")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "director_id", referencedColumnName = "person_id")
    private Person director;

}

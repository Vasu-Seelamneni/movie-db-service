package com.msp.movie.db.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private Long genreId;

    private String name;

    // Constructor
    public Genre() {
    }

    public Genre(String name) {
        this.name = name;
    }

}

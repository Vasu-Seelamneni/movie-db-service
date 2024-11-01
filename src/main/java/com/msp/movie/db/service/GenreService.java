package com.msp.movie.db.service;

import com.msp.movie.db.model.Genre;
import java.util.List;

public interface GenreService {
    Genre save(Genre genre);

    Genre findById(Long genreId);

    List<Genre> findAll();

    void deleteGenre(Long id);

    // Other methods for CRUD operations
}

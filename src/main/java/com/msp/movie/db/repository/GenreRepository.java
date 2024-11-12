package com.msp.movie.db.repository;

import com.msp.movie.db.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

    //You can also create customized query methods
    //Genre findByName(String name);
}

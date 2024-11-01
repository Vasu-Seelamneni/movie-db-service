package com.msp.movie.db.repository;

import com.msp.movie.db.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends JpaRepository<Person, Long> {
}

package com.msp.movie.db.service;

import com.msp.movie.db.model.Person;

import java.util.List;

public interface PersonsService {

    public Person save(Person persons);

    public Person findById(Long personId);

    public List<Person> findAll();

    public void deletePerson(Long id);
}

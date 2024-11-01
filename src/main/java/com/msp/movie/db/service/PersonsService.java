package com.msp.movie.db.service;

import com.msp.movie.db.model.Persons;

import java.util.List;

public interface PersonsService {

    public Persons save(Persons persons);

    public Persons findById(Long personId);

    public List<Persons> findAll();

    public void deletePerson(Long id);
}

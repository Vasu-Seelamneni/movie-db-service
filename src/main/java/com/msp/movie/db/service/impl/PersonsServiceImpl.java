package com.msp.movie.db.service.impl;

import com.msp.movie.db.model.Persons;
import com.msp.movie.db.repository.PersonsRepository;
import com.msp.movie.db.service.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonsServiceImpl implements PersonsService {

    private final PersonsRepository personsRepository;

    @Autowired
    public PersonsServiceImpl(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    @Override
    public Persons save(Persons persons) {
        return personsRepository.save(persons);
    }

    @Override
    public Persons findById(Long personId) {
        return personsRepository.findById(personId).orElse(null);
    }

    @Override
    public List<Persons> findAll() {
        return personsRepository.findAll();
    }

    @Override
    public void deletePerson(Long id) {
        personsRepository.deleteById(id);
    }
}

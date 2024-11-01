package com.msp.movie.db.service.impl;

import com.msp.movie.db.model.Person;
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
    public Person save(Person persons) {
        return personsRepository.save(persons);
    }

    @Override
    public Person findById(Long personId) {
        return personsRepository.findById(personId).orElse(null);
    }

    @Override
    public List<Person> findAll() {
        return personsRepository.findAll();
    }

    @Override
    public void deletePerson(Long id) {
        personsRepository.deleteById(id);
    }
}

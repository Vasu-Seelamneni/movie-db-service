package com.msp.movie.db.controller;

import com.msp.movie.db.model.Persons;
import com.msp.movie.db.service.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonsController {

    private final PersonsService personsService;

    @Autowired
    public PersonsController(PersonsService personsService) {
        this.personsService = personsService;
    }

    @GetMapping("/all")
    public List<Persons> getAllPersons() {
        return personsService.findAll();
    }

    @GetMapping("/find/{id}")
    public Persons findPersonById(@PathVariable Long id) {
        return personsService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable Long id) {
        personsService.deletePerson(id);
    }

    @PostMapping("/save")
    public Persons savePerson(@RequestBody Persons persons) {
        return personsService.save(persons);
    }

}

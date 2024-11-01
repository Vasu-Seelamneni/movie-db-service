package com.msp.movie.db.controller;

import com.msp.movie.db.model.Person;
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
    public List<Person> getAllPersons() {
        return personsService.findAll();
    }

    @GetMapping("/find/{id}")
    public Person findPersonById(@PathVariable Long id) {
        return personsService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable Long id) {
        personsService.deletePerson(id);
    }

    @PostMapping("/save")
    public Person savePerson(@RequestBody Person person) {
        return personsService.save(person);
    }

}

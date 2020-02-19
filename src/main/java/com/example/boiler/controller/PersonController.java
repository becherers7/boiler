package com.example.boiler.controller;

import com.example.boiler.entity.Person;
import com.example.boiler.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("")
    ResponseEntity<List<Person>> findAllPeople() {
        return ResponseEntity.ok(personService.findAllPeople());
    }

    @GetMapping("{personId}")
    ResponseEntity<Optional<Person>> findById(@PathVariable Integer personId) throws Exception {
        return ResponseEntity.ok(personService.findById(personId));
    }

    @PostMapping("")
    public ResponseEntity<List<Person>> createPeople(@RequestBody List<Person> personList) throws Exception {
        return ResponseEntity.ok(personService.insertPeopleData(personList));
    }

    @PutMapping("")
    public void updatePeopleData(@RequestBody List<Person> people) throws Exception {
        personService.updatePeopleData(people);
    }
    @DeleteMapping()
    public void deletePeopleData(@RequestBody List<Integer> peopleIds) throws Exception {
        personService.deletePeopleData(peopleIds);
    }
}

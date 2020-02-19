package com.example.boiler.service.impl;

import com.example.boiler.entity.Person;
import com.example.boiler.repository.PersonRepository;
import com.example.boiler.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    public List<Person> findAllPeople() {
        return personRepository.findAll();
    }

    public Optional<Person> findById(Integer personId) {
        return personRepository.findById(personId);
    }

    public List<Person> insertPeopleData(List<Person> personList) {
        return personRepository.saveAll(personList);
    }

    public void deletePersonData(Integer personId) {

        personRepository.deleteById(personId);
    }
    public void deletePeopleData(List<Integer> peopleIdList) {
        for (Integer personId : peopleIdList) {
            deletePersonData(personId);
        }
    }

    public void updatePeopleData(List<Person> people) throws Exception {
        for (Person person: people) {
            deletePersonData(person.getPersonId());
            Person newPerson = copyPerson(person);
            personRepository.save(newPerson);
        }
    }

    public Person copyPerson(Person originalPerson) {
        /*
            firstName
            lastName
            career
         */
        Person newPerson = new Person();
        newPerson.setPersonId(originalPerson.getPersonId());
        newPerson.setFirstName(originalPerson.getFirstName());
        newPerson.setLastName(originalPerson.getLastName());
        newPerson.setCareer(originalPerson.getCareer());
        return newPerson;
    }

    public Person findByLastName(String lastName) {
        Logger logger = Logger.getLogger(PersonServiceImpl.class.getName());
        logger.info("find by last name " + lastName);
        return personRepository.findByLastName(lastName);
    }
}

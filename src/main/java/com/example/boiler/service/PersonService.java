package com.example.boiler.service;

import com.example.boiler.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PersonService {
    List<Person> findAllPeople();
    Optional<Person> findById(Integer personId) throws Exception;
    List<Person> insertPeopleData(List<Person> personList) throws Exception;
    Person findByLastName(String lastName) throws Exception;
    void updatePeopleData(List<Person> people) throws Exception;
    void deletePeopleData(List<Integer> people) throws Exception;

}

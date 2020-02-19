package com.example.boiler.repository;
import com.example.boiler.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    @Query(value = "select * from people where last_name = ?1", nativeQuery = true)
    Person findByLastName(String lastName);
}

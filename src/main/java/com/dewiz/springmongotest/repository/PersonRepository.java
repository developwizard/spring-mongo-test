package com.dewiz.springmongotest.repository;

import com.dewiz.springmongotest.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    List<Person> findByFirstNameAndStartsWith(String name);

    @Query(value = "{'age': {$gt: ?0, $lt:  ?1}}")
    List<Person> findPersonByAgeBetween(Integer min, Integer max);
}

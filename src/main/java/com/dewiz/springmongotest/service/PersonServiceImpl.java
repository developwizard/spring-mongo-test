package com.dewiz.springmongotest.service;

import com.dewiz.springmongotest.entity.Person;
import com.dewiz.springmongotest.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;
    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }

    @Override
    public List<Person> getPersonStartWith(String name) {
        return personRepository.findByFirstNameAndStatsWith(name);
    }

    @Override
    public void delete(String id) {
        personRepository.deleteById(id);
    }
}

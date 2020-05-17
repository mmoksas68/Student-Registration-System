package com.group29.srs.services;

import com.group29.srs.model.Person;
import com.group29.srs.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<Person> getPersons(){
        return personRepository.getPersons();
    }
}

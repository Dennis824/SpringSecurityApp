package com.example.springsecurity.SpringSecurityApp.services;

import com.example.springsecurity.SpringSecurityApp.models.Person;
import com.example.springsecurity.SpringSecurityApp.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationService {

    private final PeopleRepository peopleRepository;


    @Autowired
    public RegistrationService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public void register(Person person){
        peopleRepository.save(person);
    }
}

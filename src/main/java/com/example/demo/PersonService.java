package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public void test() {
        PersonEntity entity = new PersonEntity();
        entity.setId("kaykaykay");
        entity.setName("kay");
        entity.setAge(20);

        personRepository.save(entity);
    }

    public void personInfo(PersonDTO personDTO) {
        PersonEntity entity = new PersonEntity();

        entity.setId(personDTO.getId());
        entity.setName(personDTO.getName());
        entity.setAge(personDTO.getAge());

        personRepository.save(entity);
    }
}

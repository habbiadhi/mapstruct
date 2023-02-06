package com.habbiadhi.mapstruct.controller;

import com.habbiadhi.mapstruct.service.impl.FakerPersonServiceImpl;
import com.habbiadhi.mapstruct.model.entity.Person;
import com.habbiadhi.mapstruct.model.request.PersonDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(Controller.PATH)
//@Slf4j
public class Controller {

    final static String PATH = "path";
    final static String PERSON = "/person";
    final static String PERSONS = "/persons";
    final static String PERSON_DTO = "/personDto";
    final static String PERSONS_DTO = "/personsDto";

    @Autowired
    private FakerPersonServiceImpl personService;

    @GetMapping(value=PERSON)
    public Person getPerson() throws ParseException {
        return personService.getPerson();
    }

    @GetMapping(value=PERSONS)
    public List<Person> getListPerson() throws ParseException {
        return personService.getPersons();
    }

    @GetMapping(value=PERSON_DTO)
    public PersonDto getPersonDto() throws ParseException {
        return personService.getPersonDto();
    }

    @GetMapping(value=PERSONS_DTO)
    public List<PersonDto> getListPersonDto() throws ParseException {
        return personService.getPersonDtos();
    }

    @GetMapping(value="test")
    public List<PersonDto> getTest(Person person)  {
//        System.out.print(person.getName());
//        System.out.print(person.getBloodGroup());
//        System.out.print(person.getBirthDate());
//        log.info("TEST");
        return new ArrayList<>();
    }
}

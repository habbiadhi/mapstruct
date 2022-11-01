package com.habbiadhi.mapstruct.service;

import com.habbiadhi.mapstruct.model.entity.Person;
import com.habbiadhi.mapstruct.model.request.PersonDto;

import java.text.ParseException;
import java.util.List;

public interface PersonService {

    PersonDto getPersonDto() throws ParseException;
    List<PersonDto> getPersonDtos() throws ParseException;
    Person getPerson() throws Exception;
    List<Person> getPersons() throws Exception;
}
package com.habbiadhi.mapstruct.mapper;

import com.habbiadhi.mapstruct.model.entity.Person;
import com.habbiadhi.mapstruct.model.request.PersonDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.text.ParseException;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonDto personToPersonDto(Person person) throws ParseException;

    List<PersonDto> personsToPersonDtos(List<Person> personList) throws ParseException;

    @InheritInverseConfiguration(name = "personToPersonDto")
    Person dtoToPerson(PersonDto personDto) throws ParseException;

    @InheritInverseConfiguration(name = "personsToPersonDtos")
    List<Person> personDtosToPersons(List<PersonDto> personDtoList) throws ParseException;
}

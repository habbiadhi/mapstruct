package com.habbiadhi.mapstruct.mapper;

import com.habbiadhi.mapstruct.model.entity.Person;
import com.habbiadhi.mapstruct.model.request.PersonDto;

import java.util.List;

//@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonDto personToPersonDto(Person person);

    List<PersonDto> personsToPersonDtos(List<Person> personList);

//    @InheritInverseConfiguration(name = "personToPersonDto")
    Person dtoToPerson(PersonDto personDto);

//    @InheritInverseConfiguration(name = "personsToPersonDtos")
    List<Person> personDtosToPersons(List<PersonDto> personDtoList);
}

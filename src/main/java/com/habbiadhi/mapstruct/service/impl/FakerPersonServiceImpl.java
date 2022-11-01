package com.habbiadhi.mapstruct.service.impl;

import com.github.javafaker.Faker;
import com.habbiadhi.mapstruct.mapper.PersonMapper;
import com.habbiadhi.mapstruct.model.entity.Address;
import com.habbiadhi.mapstruct.model.entity.Person;
import com.habbiadhi.mapstruct.model.request.PersonDto;
import com.habbiadhi.mapstruct.service.PersonService;
import com.habbiadhi.mapstruct.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service("fakerPersonService")
public class FakerPersonServiceImpl implements PersonService {

    private final Faker faker = new Faker();

    @Autowired
    private PersonMapper personMapper;

    private Util util = Util.getInstance();

    public PersonDto getPersonDto() throws ParseException {
        return personMapper.personToPersonDto(getPerson());
    }

    public List<PersonDto> getPersonDtos() throws ParseException {
        return personMapper.personsToPersonDtos(getPersons());
    }

    public Person getPerson() throws ParseException {

        // address 1
        Address address = Address.builder()
                .streetName(faker.address().streetName())
                .city(faker.address().city())
                .zipCode(faker.address().zipCode())
                .build();

        return Person.builder()
                .name(faker.name().fullName())
                .birthDate(util.stringToDate(faker.backToTheFuture().date()))
                .bloodGroup(faker.name().bloodGroup())
                .address(address)
                .build();
    }

    public List<Person> getPersons() throws ParseException {
        List<Person> result = new ArrayList<>();

        // address 1
        Address address1 = Address.builder()
                .streetName(faker.address().streetName())
                .city(faker.address().city())
                .zipCode(faker.address().zipCode())
                .build();

        // Person 1
        Person person = Person.builder()
                .name(faker.name().fullName())
                .birthDate(util.stringToDate(faker.backToTheFuture().date()))
                .bloodGroup(faker.name().bloodGroup())
                .address(address1)
                .build();

        // address 1
        Address address21 = Address.builder()
                .streetName(faker.address().streetName())
                .city(faker.address().city())
                .zipCode(faker.address().zipCode())
                .build();

        // address 1
        Address address22 = Address.builder()
                .streetName(faker.address().streetName())
                .city(faker.address().city())
                .zipCode(faker.address().zipCode())
                .build();

        // Person 2
        Person person2 = Person.builder()
                .name(faker.name().fullName())
                .birthDate(util.stringToDate(faker.backToTheFuture().date()))
                .bloodGroup(faker.name().bloodGroup())
                .address(address21)
                .address(address22)
                .build();

        result.add(person);
        result.add(person2);
        return result;
    }
}
package com.habbiadhi.mapstruct.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.Date;
import java.util.List;

@Data
@Builder(toBuilder = true)
public class Person {

    private String name;
    private Date birthDate;
    private String bloodGroup;
    @Singular
    private List<Address> addresses;

}

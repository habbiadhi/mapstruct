package com.habbiadhi.mapstruct.model.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Address {

    private String city;
    private String streetName;
    private String zipCode;

}

package com.habbiadhi.mapstruct.model.request;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class PersonDto {
    private String name;
    private Date birthDate;
    private String bloodGroup;
    private List<AddressDto> addresses;

    @Data
    public static class AddressDto {
        private String streetName;
    }
}

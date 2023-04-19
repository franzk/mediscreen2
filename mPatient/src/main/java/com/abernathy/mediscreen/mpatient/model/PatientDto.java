package com.abernathy.mediscreen.mpatient.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDto {

    Integer id;

    private String lastName;

    private String firstName;

    private String birthdate;

    private String sex;

    private String address;

    private String phone;

}
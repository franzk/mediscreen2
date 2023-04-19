package com.abernathy.mediscreen.massessment.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient {

        Integer id;

        private String lastName;

        private String firstName;

        private String birthdate;

        private String sex;

        private String address;

        private String phone;

}

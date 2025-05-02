package com.alphonse.student.dtos;

import lombok.Data;

@Data
public class StudentUpdateDTO {
    private String firstname;
    private String lastname;
    private String email;
    private Integer schoolId;
}

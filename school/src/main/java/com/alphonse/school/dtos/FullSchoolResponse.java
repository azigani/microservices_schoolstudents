package com.alphonse.school.dtos;

import com.alphonse.student.entities.Student;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {

    private String firstname;
    private String lastname;
    private String email;
    List<Student> students;

}

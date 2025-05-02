package com.alphonse.student.services;


import com.alphonse.student.dtos.StudentUpdateDTO;
import com.alphonse.student.entities.Student;
import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> listeStudent();
    Student findStudentById(Integer id);
    void deleteStudent(Integer id);
    Student updateStudent(Integer id, StudentUpdateDTO student);

    List<Student> findAllStudentsBySchool(Integer schoolId);
}
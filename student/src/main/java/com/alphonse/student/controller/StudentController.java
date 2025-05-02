package com.alphonse.student.controller;

import com.alphonse.student.entities.Student;
import com.alphonse.student.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/V1/students")
public class StudentController {

    private StudentService studentService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Student student
    ) {
        studentService.saveStudent(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents() {
        return ResponseEntity.ok(studentService.listeStudent());
    }

    @GetMapping("/school/{school-id}")

    public ResponseEntity<List<Student>> findAllStudents(
            @PathVariable("school-id") Integer schoolId
    ) {
        return ResponseEntity.ok(studentService.findAllStudentsBySchool

                (schoolId));
    }


}

package com.alphonse.student.controller;

import com.alphonse.school.dtos.FullSchoolResponse;
import com.alphonse.school.entities.School;
import com.alphonse.school.services.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/V1/schools")
public class SchoolController {

    private SchoolService schoolService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody School school
    ) {
        schoolService.saveSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllSchools() {
        return ResponseEntity.ok(schoolService.listeSchool());
    }

    @GetMapping("/liste-etudiants-par-ecole/{school-id}")
    public ResponseEntity<FullSchoolResponse> findAllSchools(
            @PathVariable("school-id") Integer schoolId
    ) {

        return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
    }
}

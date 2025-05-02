package com.alphonse.school.services;


import com.alphonse.school.entities.School;

import java.util.List;

public interface SchoolService {
    School saveSchool(School school);
    List<School> listeSchool();
    School findSchoolById(Integer id);
    void deleteSchool(Integer id);
    School updateSchool(Integer id, School school);
}
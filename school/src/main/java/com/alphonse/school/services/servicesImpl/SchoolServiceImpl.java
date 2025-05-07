package com.alphonse.school.services.servicesImpl;


import com.alphonse.school.dtos.FullSchoolResponse;
import com.alphonse.school.entities.School;
import com.alphonse.school.repositories.SchoolRepository;
import com.alphonse.school.services.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

private final SchoolRepository schoolRepository;
    @Override
    public School saveSchool(School school) {
        return null;
    }

    @Override
    public List<School> listeSchool() {
        return null;
    }

    @Override
    public School findSchoolById(Integer id) {
        return null;
    }

    @Override
    public void deleteSchool(Integer id) {

    }

    @Override
    public School updateSchool(Integer id, School school) {
        return null;
    }

    @Override
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {

        var school = schoolRepository.findById(schoolId);

        return null;
    }
}

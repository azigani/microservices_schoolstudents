package com.alphonse.student.services.servicesImpl;

import com.alphonse.student.entities.Student;
import com.alphonse.student.repositories.StudentRepository;
import com.alphonse.student.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {


    private  StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public List<Student> listeStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    @Override
    public void deleteStudent(Integer id) {
        if (!studentRepository.existsById(id)) {
            throw new RuntimeException("Student not found with id: " + id);
        }

        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Integer id, Student student) {
        Student existingStudent = findStudentById(id);
existingStudent.setFirstname(student.getFirstname());
existingStudent.setLastname(student.getLastname());
existingStudent.setEmail(student.getEmail());
existingStudent.setSchoolId(student.getSchoolId());
        return studentRepository.save(existingStudent);

    }
}

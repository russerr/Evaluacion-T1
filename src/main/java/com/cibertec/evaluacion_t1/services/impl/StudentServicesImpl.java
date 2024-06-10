package com.cibertec.evaluacion_t1.services.impl;

import com.cibertec.evaluacion_t1.model.Student;
import com.cibertec.evaluacion_t1.repository.StudentRepository;
import com.cibertec.evaluacion_t1.services.StudentServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServicesImpl implements StudentServices {

    StudentRepository _studentRepository;

    public StudentServicesImpl(StudentRepository studentRepository) {
        _studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return _studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student entity) {
        return _studentRepository.save(entity);
    }

    @Override
    public Student findStudentById(int id) {
        Optional<Student> student = _studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        } else {
            return new Student();
        }
    }

    @Override
    public void deleteStudentById(int id) {
        _studentRepository.deleteById(id);
    }
}

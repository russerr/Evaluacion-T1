package com.cibertec.evaluacion_t1.services;

import com.cibertec.evaluacion_t1.model.Student;

import java.util.List;

public interface StudentServices {

    List<Student> getAllStudents();
    Student saveStudent(Student entity);
    Student findStudentById(int id);
    void deleteStudentById(int id);
}

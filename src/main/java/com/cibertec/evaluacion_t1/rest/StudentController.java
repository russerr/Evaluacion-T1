package com.cibertec.evaluacion_t1.rest;

import com.cibertec.evaluacion_t1.model.Student;
import com.cibertec.evaluacion_t1.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    StudentServices studentServices;

    @Autowired
    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentServices.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentServices.findStudentById(id);
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return studentServices.saveStudent(student);
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
        return studentServices.saveStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentServices.deleteStudentById(id);
    }


}

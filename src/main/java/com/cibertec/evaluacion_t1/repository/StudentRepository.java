package com.cibertec.evaluacion_t1.repository;

import com.cibertec.evaluacion_t1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}

package org.springboot.jdbc.student.repository;

import org.springboot.jdbc.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

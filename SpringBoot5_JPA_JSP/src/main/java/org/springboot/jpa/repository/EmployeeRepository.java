package org.springboot.jpa.repository;

import org.springboot.jpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}

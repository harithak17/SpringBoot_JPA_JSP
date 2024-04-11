package org.springboot.jdbc.employee.repository;

import java.util.List;

import org.springboot.jdbc.employee.model.Employee;

//DAO Layer
public interface EmployeeRepository {

	public List<Employee> getAllEmployees();

	public Employee findeEmployeeById(int id);

	public void addEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(int id);
}

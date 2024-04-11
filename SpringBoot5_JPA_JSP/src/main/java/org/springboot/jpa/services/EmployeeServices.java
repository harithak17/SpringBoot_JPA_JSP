package org.springboot.jpa.services;

import java.util.List;

import org.springboot.jpa.model.Employee;

public interface EmployeeServices {

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int id);

	public void saveOrUpdate(Employee emp);

	public void deleteEmployee(int id);
}

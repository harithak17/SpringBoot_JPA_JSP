package org.springboot.jdbc.employee.services;

import java.util.List;

import org.springboot.jdbc.employee.model.Employee;
import org.springboot.jdbc.employee.repository.EmployeeRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service annotation is used with classes that provide some business functionalities. 

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepoImpl employeeRepo;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.getAllEmployees();
	}

	@Override
	public Employee findEmployeeById(int id) {
		return employeeRepo.findeEmployeeById(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepo.addEmployee(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepo.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepo.deleteEmployee(id);
	}

}

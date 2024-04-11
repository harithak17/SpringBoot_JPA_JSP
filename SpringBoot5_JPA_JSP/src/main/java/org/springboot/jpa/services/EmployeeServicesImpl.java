package org.springboot.jpa.services;

import java.util.List;

import org.springboot.jpa.model.Employee;
import org.springboot.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeServicesImpl implements EmployeeServices{
	
	@Autowired
	EmployeeRepository repo;
	
	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) repo.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Employee emp) {
		 repo.save(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}

}

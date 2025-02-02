package org.springboot.jdbc.employee.controller;

import java.util.List;

import org.springboot.jdbc.employee.model.Employee;
import org.springboot.jdbc.employee.services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeService;

	@GetMapping(value = { "", "/", "/{id}" })
	//http://localhost:8083/employee
	public ModelAndView hello(ModelAndView Model, @PathVariable(name = "id", required = false) Integer id) {

		if (id != null && id > 0) {
			Employee employee = employeeService.findEmployeeById(id);
			Model.addObject("employeeForm", employee);
		} else {
			Model.addObject("employeeForm", new Employee());
		}
		Model.setViewName("employee_form");
		return Model;
	}

	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public ModelAndView getAllEmployees() {
		ModelAndView model = new ModelAndView();
		List<Employee> list = employeeService.getAllEmployees();

		model.addObject("employee_list", list);
		model.setViewName("employee_list");
		return model;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public ModelAndView editEmployee(@PathVariable int id) {
		ModelAndView model = new ModelAndView();
		Employee employee = employeeService.findEmployeeById(id);
		model.addObject("employeeForm", employee);
		model.setViewName("employee_form");
		return model;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addEmployee() {
		ModelAndView model = new ModelAndView();

		Employee employee = new Employee();
		model.addObject("employeeForm", employee);

		model.setViewName("employee_form");
		return model;
	}

	@RequestMapping(value = { "/save", "/employee/save" })
	public ModelAndView saveOrUpdate(@ModelAttribute("employeeForm") Employee employee) {
		System.out.println("Inside save");
		System.out.println("Inside save Id---> " + employee.getEmployeeId());
		if (employee.getEmployeeId() != null) {
			employeeService.updateEmployee(employee);
		} else {
			employeeService.addEmployee(employee);
		}

		return new ModelAndView("redirect:/employee/list");
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);

		return new ModelAndView("redirect:/employee/list");
	}
}

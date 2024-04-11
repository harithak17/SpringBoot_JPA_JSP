package org.springboot.jdbc.student.controller;

import org.springboot.jdbc.student.model.Student;
import org.springboot.jdbc.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping(value = "/")
	public String displayForm() {
		System.out.print("<------Inside controller---------");
		return "saveStudent";
	}

	@PostMapping("/save")
	public String saveStudent(@RequestParam String firstName, @RequestParam String lastName) {
		System.out.print("<------Inside Save---------");
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		studentRepository.save(student);
		return "redirect:/"; // Redirect to home page
	}
}

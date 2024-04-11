package org.springboot.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StudentController {

	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping(value = {"/stud"},method=RequestMethod.GET)
	public String addStudent()
	{
		return "StudentDetails";
	}
	
	@RequestMapping(value = {"/viewstud"},method=RequestMethod.POST)
	public String viewDetails(Model m,@RequestParam("stud_Id") String stud_Id,@RequestParam("stud_Name") String stud_Name,@RequestParam("stud_Course") String stud_Course)
	{
		try
		{
			jdbc.execute("insert into user values('"+stud_Id+"','"+stud_Name+"','"+stud_Course+"')");
		}
		catch(Exception e)
		{
			System.out.print("Error:"+e);
		}
		m.addAttribute("stud_Id", stud_Id);
		m.addAttribute("stud_Name", stud_Name);
		m.addAttribute("stud_Course", stud_Course);
		return "ViewStudent";
	}
}

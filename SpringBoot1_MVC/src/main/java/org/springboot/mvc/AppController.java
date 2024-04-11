package org.springboot.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/hello")
	public String Hello(@RequestParam("name") String name)
	{
		return "Welcome!!!!! "+name;
	}
	
	// http://localhost:8085/hello?name=Haritha
	
}

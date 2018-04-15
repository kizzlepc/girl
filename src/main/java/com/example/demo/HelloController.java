package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class HelloController {

	@Autowired
	private GirlProperties girlProperties;
	
	@RequestMapping(value="/{id1}/say/{id2}", method=RequestMethod.GET)
	public String say(@PathVariable("id1") Integer id1, @PathVariable("id2") Integer id2) {
		//return "Hello Spring Boot!";
		//return cupSize+":"+age;
		//return girlProperties.getCupSize();
		return "id1:"+id1+" - id2:"+id2;
	}
}

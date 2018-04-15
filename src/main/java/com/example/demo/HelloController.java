package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class HelloController {

	@Autowired
	private GirlProperties girlProperties;
	
	//@RequestMapping(value="/say", method=RequestMethod.GET)
	@GetMapping(value="/say")
	public String say(@RequestParam(value="id", required=false, defaultValue="0") Integer id1) {
		return "id1:"+id1;
	}
}

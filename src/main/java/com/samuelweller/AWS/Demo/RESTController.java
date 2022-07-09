package com.samuelweller.AWS.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
}

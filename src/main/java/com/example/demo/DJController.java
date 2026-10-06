package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DJController {
	
	@GetMapping(path = "/welcome")
	public String welcome() {
		return "welcome to docker jenkins tutorial";
	}

}

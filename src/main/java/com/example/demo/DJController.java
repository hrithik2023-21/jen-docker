package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DJController {
	
	private DJService service;
	
	@Autowired
	public void setDJService(DJService service) {
		this.service = service;
	}
	
	@PostMapping(path = "/save", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Employee> save(@RequestBody Employee emp) {
		Employee response = service.save(emp);
		return ResponseEntity.ok().body(response);
	}

}

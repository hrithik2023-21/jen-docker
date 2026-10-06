package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DJService {

	private EmployeeRepository repo;
	
	public DJService(EmployeeRepository repo) {
		this.repo = repo;
	}
	
	public Employee save(Employee emp) {
		Employee employee = repo.save(emp);
		return employee;
	}
}

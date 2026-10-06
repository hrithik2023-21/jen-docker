package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
	
	@Mock
	EmployeeRepository repo;
	
	@InjectMocks
	DJService service;
	
	@Test
	public void saveTest() {
		Employee emp = new Employee();
		emp.setName("Balaraju");
		emp.setMobile("9876543210");
		
		when(repo.save(emp)).thenReturn(emp);
		Employee result = service.save(emp);
		
		assertEquals(emp.getName(), result.getName());
		assertEquals(emp.getMobile(), result.getMobile());
		
		verify(repo).save(emp);
		
	}

}

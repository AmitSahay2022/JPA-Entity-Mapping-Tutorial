package com.amit.entityrelation.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.entityrelation.entity.Employee;
import com.amit.entityrelation.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {
	private EmployeeRepository repository;

	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>(repository.save(employee), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmpoyee() {
		return new ResponseEntity<List<Employee>>(repository.findAll(), HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		repository.deleteById(id);
		return new ResponseEntity<String>("Employee Deleted", HttpStatus.OK);
	}
}

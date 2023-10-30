package com.amit.entityrelation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.entityrelation.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

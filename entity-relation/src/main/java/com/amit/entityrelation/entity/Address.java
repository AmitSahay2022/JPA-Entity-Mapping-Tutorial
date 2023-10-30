package com.amit.entityrelation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String street;
	private String city;
	private String state;
	private int pinCode;
	@OneToOne(mappedBy = "address") //This statement is saying employee class has field address 	   
	private Employee employee;            //which will take care Foreign key for mapping
}              //In other words Employee is the owner in this relationship
/*
 * mappedBy -->when we use mappedBy property then no extra column is created
 * 
 */
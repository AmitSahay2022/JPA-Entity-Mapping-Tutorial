package com.amit.entityrelation.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	//One Employee can have only one address
	@OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
	private Address address;
}
/*
 * If we don't use Cascade property then we will have to save Address independently using 
 * AddressRepository 
 * 
 * orphanRemoval --> Address can not exist without it's parent (Employee) 
 * 
 * @JoinColumn --> this annotation is used to give customize name to that column which will hold foreign
 *                  key to establish relationship.
 */
package com.example.mysql.mapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Bidirectional_Address_Example {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String streetName;
	private int pinCode;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "persion_id")
	private Bidirectional_Person_Example person_example;
	
	public Bidirectional_Person_Example getPerson_example() {
		return person_example;
	}

	public void setPerson_example(Bidirectional_Person_Example person_example) {
		this.person_example = person_example;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		
		return "Street Name ==>"+getStreetName()+" Pin Code ==>"+getPinCode();
	}
}

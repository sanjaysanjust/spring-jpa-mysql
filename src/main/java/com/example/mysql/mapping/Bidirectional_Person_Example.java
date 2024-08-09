package com.example.mysql.mapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Bidirectional_Person_Example {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "person_example")
	private Bidirectional_Address_Example address_Example;
	
	public Bidirectional_Address_Example getAddress_Example() {
		return address_Example;
	}
	public void setAddress_Example(Bidirectional_Address_Example address_Example) {
		this.address_Example = address_Example;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name ==>"+getName()+" Address ==>"+getAddress_Example();
	}

}

package com.example.mysql.mapping.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mysql.mapping.Address;
import com.example.mysql.mapping.Person;
import com.example.mysql.mapping.repository.PersonInterface;

@SpringBootTest
public class TestUnidirectionalMapping {

	@Autowired
	PersonInterface personInterface;

	
	
	@Test
	public void addPersonTest() {
		Address address= new Address();
		Person person = new Person();
		address.setPinCode(577510);
		address.setStreetName("1st cross");
		person.setName("RAvi");
		person.setAddress(address);

		personInterface.save(person);
	}

}

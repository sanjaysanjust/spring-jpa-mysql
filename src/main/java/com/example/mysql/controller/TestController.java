package com.example.mysql.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	public ResponseEntity<String> addUser() {
		
		
		return ResponseEntity.ok("User Added");
		
	}

}

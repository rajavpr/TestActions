package com.test.actions.TestActions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestActionsController {
	
	
	@GetMapping(path = "/hello")
	public ResponseEntity<String> hello() {
		
		System.out.println("Inside the hellow worls app!");
		
		return ResponseEntity.ok("Welcome to Hellow World!!!");
		
	}

}

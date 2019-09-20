package com.achilles.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.achilles.user.model.Response;
import com.achilles.user.model.User;

@RestController
public class UserController {
	
	@PostMapping("/users")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		HttpStatus status = HttpStatus.CREATED;
		Response<?> response = new Response<>();
		try {
			
		} catch(Exception e) {
			
		}
		return new ResponseEntity<Object>(response.getResponse(), status);
	}

}

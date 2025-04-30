package com.tais.spring_course.resoucers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tais.spring_course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Tais", "t@gmail.com", "11111111", "12345");
		return ResponseEntity.ok().body(u);
	}

}

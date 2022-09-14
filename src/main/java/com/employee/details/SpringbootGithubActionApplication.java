package com.employee.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGithubActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubActionApplication.class, args);
	}
	
	@GetMapping("/details")
	public void add() {
		
		System.out.println("Welcome to Git Hub action program");
	}

}

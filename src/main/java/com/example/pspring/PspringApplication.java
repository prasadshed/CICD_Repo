package com.example.pspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PspringApplication {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Hello welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(PspringApplication.class, args);
	}

}

package com.example.pspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PspringApplication {
	
	@GetMapping("/welcome/{id}")
	public String welcome(@PathVariable int id) {
		return "Hello welcome"+ id;
	}
//	@GetMapping("/welcome/{name}")
//	public String welc(@PathVariable String name) {
//		return "Hello welcome"+ name;
//	}
//	@GetMapping("/welcome/{dou}")
//	public String welc2(@PathVariable Double dou) {
//		return "Hello welcome"+ dou;   /////returning hello welcome statement
//	}
	public static void main(String[] args) {
		SpringApplication.run(PspringApplication.class, args);
	}

}

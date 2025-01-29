package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MeuBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuBackendApplication.class, args);
	}

}

@RestController
@RequestMapping("/api")
class OlaMundoController {
@GetMapping("/hello")
public String olaMundo() {
	return "Olá, Mundo!";
}
	
}

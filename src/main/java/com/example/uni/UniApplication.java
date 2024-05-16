package com.example.uni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class UniApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniApplication.class, args);
	}


}

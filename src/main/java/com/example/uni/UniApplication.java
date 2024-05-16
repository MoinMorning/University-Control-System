package com.example.uni;

import com.example.uni.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class UniApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniApplication.class, args);
	}

	@GetMapping
	public List<Student> students(){
		return List.of(
				new Student(
						1,
						"Moink",
						"moin.morning2000@gmail.com",
						LocalDate.of(2000, Month.FEBRUARY,9),
						25
				)
		);
	}
}

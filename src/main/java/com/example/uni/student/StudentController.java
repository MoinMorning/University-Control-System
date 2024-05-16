package com.example.uni.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
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

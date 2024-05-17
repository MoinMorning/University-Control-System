package com.example.uni.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
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

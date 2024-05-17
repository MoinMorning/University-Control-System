package com.example.uni.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student moin = new Student(
                        "Moink",
                        "moin.morning2000@gmail.com",
                        LocalDate.of(2000, Month.FEBRUARY, 9)
                );
            Student meounu = new Student(
                "unu",
                "meo.unu2000@hotmail.com",
                LocalDate.of(2004, Month.FEBRUARY, 9)
        );
        repository.saveAll(
                List.of(moin,meounu)
        );
    };
}
}

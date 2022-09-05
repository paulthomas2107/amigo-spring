package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student paul = new Student(
                    1L,
                    "Paul",
                    "paul@paul.com",
                    LocalDate.of(1966, JULY, 21),
                    55
            );
            Student rory = new Student(
                    "Rory",
                    "Rory@rory.com",
                    LocalDate.of(2002, MARCH, 24),
                    19
            );
            // Save to DB
            studentRepository.saveAll(
                    List.of(paul, rory)
            );
        };
    }
}

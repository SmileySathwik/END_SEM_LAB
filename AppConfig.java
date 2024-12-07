package com.example.springdidemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Employee employee() {
        List<String> skills = Arrays.asList("Java", "Spring", "Hibernate");
        return new Employee(1, "John Doe", 50000.0, "IT", skills);
    }

    @Bean
    public Instructor instructor() {
        return new Instructor(1, "Jane Smith", "jane.smith@example.com", "123-456-7890");
    }

    @Bean
    public Course course() {
        Course course = new Course(101, "Spring Boot", 3);
        course.setInstructor(instructor()); // Setter injection
        return course;
    }
}
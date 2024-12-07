package com.example.springdidemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Employee employee = context.getBean(Employee.class);
        System.out.println("Employee: " + employee);

        Course course = context.getBean(Course.class);
        System.out.println("Course: " + course);

        context.close();
    }
}
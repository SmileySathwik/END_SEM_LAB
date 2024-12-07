package com.example.springdidemo;

import java.util.List;

public class Employee {

    private int employeeId;
    private String name;
    private double salary;
    private String department;
    private List<String> skills;

    // Constructor dependency injection
    public Employee(int employeeId, String name, double salary, String department, List<String> skills) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", skills=" + skills +
                '}';
    }
}
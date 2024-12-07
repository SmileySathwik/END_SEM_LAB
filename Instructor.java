package com.example.springdidemo;

public class Instructor {

    private int instructorId;
    private String name;
    private String email;
    private String phoneNumber;

    // Constructor
    public Instructor(int instructorId, String name, String email, String phoneNumber) {
        this.instructorId = instructorId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public int getInstructorId() {
        return instructorId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorId=" + instructorId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
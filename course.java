package com.example.springdidemo;

public class Course {

    private int courseId;
    private String courseName;
    private int credits;
    private Instructor instructor;

    // Constructor
    public Course(int courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Setter injection for Instructor
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // Getters
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", instructor=" + instructor +
                '}';
    }
}
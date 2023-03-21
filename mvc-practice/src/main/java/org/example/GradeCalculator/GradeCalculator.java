package org.example.GradeCalculator;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }


    public double calculateGrade() {
        return courses.multiplyCreditAndCourseGrade() / courses.calculateTotalCompletedCredit();
    }
}

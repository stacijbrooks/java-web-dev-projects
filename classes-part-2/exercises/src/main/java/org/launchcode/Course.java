package org.launchcode;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public class Student {
        private String name;
        private static int nextStudentId = 1;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
            this.name = name;
            this.studentId = studentId;
            this.numberOfCredits = numberOfCredits;
            this.gpa = gpa;
        }

//        public Student(String name, int studentId) {
//            this(name, studentId, 0, 0);
//        }

        public Student(String name) {
            this(name, nextStudentId);
            nextStudentId++;
        }
    private String name;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
// This method generates a string representation of the Student object.
    public String toString() {
        // Format a string containing the student's name, grade level, number of credits, and GPA.
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());

        // Return the formatted string.
        return studentReport;
    }

    // This method checks if the current Student object is equal to another object.
    public boolean equals(Object toBeCompared) {
        // Check if the other object is the same instance as the current object.
        if (toBeCompared == this) {
            return true;
        }

        // Check if the other object is null.
        if (toBeCompared == null) {
            return false;
        }

        // Check if the other object belongs to the same class as the current object.
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        // Cast the other object to Student class for comparison.
        Student theStudent = (Student) toBeCompared;

        // Compare the student IDs of the current and other Student objects.
        return theStudent.getStudentId() == getStudentId();
    }

}

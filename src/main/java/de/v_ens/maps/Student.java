package de.v_ens.maps;

/*
Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.
Step 2: Create a Java List for elements of type "Student" and add multiple students.
 */

public class Student {
    private String firstName;
    private String lastName;
private String studentId;

    public Student(String firstName, String lastName, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}

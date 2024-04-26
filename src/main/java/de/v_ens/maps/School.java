package de.v_ens.maps;

import java.util.ArrayList;
import java.util.List;

/*
Step 3: Create a class "School" to which students can be added through a method ('addStudent').
Step 4: Implement a method to print all students of the school (as text, to the console).
Step 5: Add a method to find a student by their ID. The found student should be returned.
Step 6: Create a method to remove a student from the school.
 */
public class School {

    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(String studentId) {
        students.remove(findStudentById(studentId));
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

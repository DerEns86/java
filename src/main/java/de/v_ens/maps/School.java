package de.v_ens.maps;


import java.util.HashMap;

import java.util.Map;

/*
Step 3: Create a class "School" to which students can be added through a method ('addStudent').
Step 4: Implement a method to print all students of the school (as text, to the console).
Step 5: Add a method to find a student by their ID. The found student should be returned.
Step 6: Create a method to remove a student from the school.
 */
public class School {

    Map<String , Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    public Student findStudentById(String studentId) {
        return students.get(studentId);
    }

    public void removeStudent(String studentId) {
        students.remove(studentId);
    }

    public void printStudents() {
        students.values().forEach(System.out::println);
    }
}

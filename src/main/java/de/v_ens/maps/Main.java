package de.v_ens.maps;

/*
Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.
Step 2: Create a Java List for elements of type "Student" and add multiple students.
Step 3: Create a class "School" to which students can be added through a method ('addStudent').
Step 4: Implement a method to print all students of the school (as text, to the console).
Step 5: Add a method to find a student by their ID. The found student should be returned.
Step 6: Create a method to remove a student from the school.
### Bonus ###
-Expand the Java-List project with a class called "Course" that has the following properties: course name, instructor, room.
-Add a method to the Student class to add courses to the student (courses in which the student is participating).
-Implement a method within the School class to retrieve all courses of a specific student (based on a student ID).
 */


public class Main {

    public static void main(String[] args) {

        School school = new School();
        school.addStudent(new Student("John", "Doe", "123"));
        school.addStudent(new Student("Jane", "Doe", "456"));

        school.printStudents();
        System.out.println();
        System.out.println(school.findStudentById("123"));
        System.out.println();
        school.removeStudent("123");
        school.printStudents();
    }
}

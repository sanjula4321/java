package com.mycompany.test;
public class Test {

    public static void main(String[] args) 
    {
        // Creating a Student object
        Student student = new Student("Jeru", 1001, "Software Engineering");
        System.out.println("Student Name: " + student.getname());
        System.out.println("Student ID: " + student.getid());
        System.out.println("Student Course: " + student.getcourse());

        // Creating a Lecturer object
        Lecturer lecturer = new Lecturer("Joyala", 1002, "Computer Science");
        System.out.println("Lecturer Name: " + lecturer.getname());
        System.out.println("Lecturer ID: " + lecturer.getid());
        System.out.println("Lecturer Programme: " + lecturer.getprogramme());
    }
    
}

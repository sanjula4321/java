package com.mycompany.encapstest;
public class EncapsTest {
 //Exercise 3-1:
    public static void main(String[] args) {
        
        EncapsulationDemo emp = new EncapsulationDemo();
        emp.setName("John Doe");
        emp.setAge(22);
        emp.setSalary(50000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
    }


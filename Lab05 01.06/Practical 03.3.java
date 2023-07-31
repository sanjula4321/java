package com.mycompany.encapstest;
public class EncapsTest {
 // Test class

    public static void main(String[] args) {
        String empName = "Bogdan";
        double basicSalary = 50000.0;
        double bonus = 10000.0;

        // Create an Employee object with the constructor
        EncapsulationDemo emp = new EncapsulationDemo(empName, basicSalary, bonus);

        // Print Employee details
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Bonus Amount: " + emp.calculateBonusAmount());
    }
}
    


package com.mycompany.encapstest;
public class EncapsulationDemo
{
     // Encapsulated class

    private String name;
    private double basicSalary;
    private double bonus;

    // Constructor to set the name, basicSalary, and bonus
    public EncapsulationDemo(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    // Getter for basicSalary
    public double getBasicSalary() {
        return basicSalary;
    }

    // Setter for basicSalary
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Getter for bonus
    public double getBonus() {
        return bonus;
    }

    // Setter for bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Method to calculate Bonus Amount
    public double calculateBonusAmount() {
        return basicSalary + bonus;
    }
}










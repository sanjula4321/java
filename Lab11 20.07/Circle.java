package com.mycompany.mavenproject4;
public class Circle extends Shape {
	protected double r;
    protected static final double PI = 3.1415926535;

    public Circle() {
        r = 1.0;
    }

    public double area() {
        return PI * r * r;
    }
}
    


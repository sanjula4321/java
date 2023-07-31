package com.mycompany.mavenproject2;
public class InterfaceImplemented implements myfirstinterface
{
    @Override
    public void display() {
        // Trying to change the value of 'x'
        x = 20; // This will cause a compilation error
        System.out.println("Value of x inside display(): " + x);
        /*The attempt to change the value of 'x' inside the "display()" method will result in a compilation error. 
This is because interface variables are implicitly final,
and you cannot reassign a value to a final variable once it has been initialized.*/
    }
    
}

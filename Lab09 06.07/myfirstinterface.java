package com.mycompany.mavenproject2;
public interface myfirstinterface
{
    int x = 10; /*1.In interfaces, variable declarations are implicitly considered as ‘public’ , ‘static’ and ‘final’.
This means that the variable is accessible from anywhere, belongs to the interface itself and its value cannot be modified once it’s assigned */


  abstract void display();/*2.In Java interfaces, all methods are implicitly abstract and public. 
Therefore, when you declare a method inside the interface, you don't need to include the "abstract" keyword explicitly. 
It is already assumed to be an abstract method.*/
    
}

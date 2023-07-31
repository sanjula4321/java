package com.mycompany.test;
public class Person 
{
    private String name;
    private int id;
    
    //constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
   
    //setter method
    public void setname(String nm){
        name=nm;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    //getter method
    public String getname(){
        return name;
    }
    
    public int getid(){
        return id;
    }
}

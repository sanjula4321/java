package com.mycompany.test;
public class Student extends Person
{
  private String course;
  //constructor
  public Student(String name, int id, String course) {
        super(name, id);
        this.course = course;
  }
  //setter method
  public void setcourse(String course){
      this.course=course;
  }
  //getter method
  public String getcourse(){
      return course;
  }
  

}

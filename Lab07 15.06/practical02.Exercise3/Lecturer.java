package com.mycompany.test;
public class Lecturer extends Person 
{
      private String programme;
      // Constructor
    public Lecturer(String name, int id, String programme) {
        super(name, id);
        this.programme = programme;
    } 
  
  //setter method
  public void setprogramme(String programme){
      this.programme=programme;
  }
  //getter method
  public String getprogramme(){
      return programme;
  }
}

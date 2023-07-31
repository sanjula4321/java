package com.mycompany.company;
public class Employee 
{
    private int empID;
    private String empName,empDesignation;
    
    public void setId(int empId){
        this.empID=empId;
    }
    public int getID(){
        return empID;
    }
    public void setname(String empname){
        this.empName=empname;
    }
    public String getname(){
        return empName;
    }
    public void setDesignation(String empdesignation){
        this.empDesignation=empdesignation;
    }
    public String getempDesignation(){
        return empDesignation;
    }
}

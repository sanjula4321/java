package com.mycompany.jj;
public class  Item 
{
    //1.
    private int location;
    private String description;
    
    //2.Constuctor method
    public Item(int location,String description)
    //3.
    {
        this.location=location;
        this.description=description;
    }
    //4.
    //getter method
    public int getlocation(){
        return location;
    }
    public String getdescription(){
        return description;
    }
    //setter method
    public void setlocation(int loc){
        location=loc;
    }
    public void setdescription(String des){
        description=des;
    }
}

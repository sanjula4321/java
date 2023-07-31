package com.mycompany.company;
public class Company 
{
   public static void main(String[] args) {
        
Employee e new=Employee();
        
Employee e1 new=Employee();
        
       e.setId(1001);
       e.setname("Mr.Bogdan");
       e.setDesignation("Mannager");
       
      e1.setId(1002);
       e1.setname("Ms.Bird");
       e1.setDesignation("Accountan");
       
       System.out.println("Mr.Bogdan's Details:");
       System.out.println("ID : "+e.getID());
       System.out.println("Name : "+e.getname());
       System.out.println("Designation : "+e.getempDesignation());
       
       System.out.println("Ms.Bird's Details : ");
       System.out.println("ID : "+ e1.getID());
       System.out.println("Name : "+ e1.getname());
       System.out.println("Designation : " +e1.getempDesignation());
    }
}

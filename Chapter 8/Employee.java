/*
Program:       Employee
Author:        Fabricio Teixeira
Date:          04/25/2017
Description:   This class specifies the Employee object, that inherit
               from the Person class and specifies the employee ID and 
               department.
*/

public class Employee extends Person {
   private int id;
   private String dept;
   
   // default constructor
   public Employee() {
      super(); // calls parent default constructor
      this.setId(0);
      this.setDept("No department assigned");
   }
   
   // overloaded constructor (3 args)
   public Employee(String name, int id, String dept) {
      super(name); // calls parent overloaded constructor
      this.setId(id);
      this.setDept(dept);
   }
      
   // mutator - change name, employee id, and department 
   public void reset(String name, int id, String dept) {
      this.setName(name);
      this.setId(id);
      this.setDept(dept);
   }
   
   // mutator - change only employee id
   public void setId(int id) {
      this.id = id;
   }
   
   // mutator - change only employee department
   public void setDept(String dept) {
      this.dept = dept;
   }
   
   // accessor - get the employee id
   public int getId() {
      return this.id;
   }
   
   // accessor - get the employee department
   public String getDept() {
      return this.dept;
   }
   
   // overrides the write output method to outputs the information for the user
   @Override
   public void writeOutput() {
      super.writeOutput();
      System.out.println("Employee ID: " + this.getId());
      System.out.println("Department: " + this.getDept());
   }
   
   // check if there's a employee with same name and same id
   public boolean equals(Employee otherEmployee) {
      return (super.hasSameName(otherEmployee) && (this.getId() == otherEmployee.getId()) && (this.getDept().equals(otherEmployee.getDept())));
   }
   
   // overrides object toString() method
   @Override
   public String toString() {
      return "Name: " + this.getName() + "\nEmployee ID: " + this.getId() + "\nDepartment: " + this.getDept();
   }
}
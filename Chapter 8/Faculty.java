/*
Program:       Faculty
Author:        Fabricio Teixeira
Date:          04/25/2017
Description:   This class specifies the Faculty object, that inherit
               from the Employe class and specifies the title.
*/

public class Faculty extends Employee {
   private String title;
   
   // default constructor
   public Faculty() {
      super(); // calls parent default constructor
      this.setTitle("No title");
   }
   
   // overloaded constructor
   public Faculty (String name, int id, String dept, String title) {
      super(name, id, dept); // calls parent overloaded constructor
      this.setTitle(title);
   }
   
   // mutator - change name, id, dept, and title
   public void reset(String name, int id, String dept, String title) {
      this.setName(name);
      this.setId(id);
      this.setDept(dept);
      this.setTitle(title);
   }
   
   // mutator - change faculty title
   public void setTitle(String title) {
      this.title = title;
   }
   
   // accessor - get the faculty title
   public String getTitle() {
      return this.title;
   }
   
   // overrides the write output method to outputs the information for the user
   @Override
   public void writeOutput() {
      super.writeOutput();
      System.out.println("Title: " + this.getTitle());
   }
   
   // check if there's a faculty with same information
   public boolean equals(Faculty otherFaculty) {
      return (super.equals(otherFaculty) && (this.getTitle().equals(otherFaculty.getTitle())));
   }
   
   // overrides object toString() method
   @Override
   public String toString() {
      return "Name: " + this.getName() + "\nEmployee ID: " + this.getId() + "\nDepartment: " + this.getDept() + "\nTitle: " + this.getTitle();
   }

   
}
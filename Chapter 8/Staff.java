/*
Program:       Staff
Author:        Fabricio Teixeira
Date:          04/25/2017
Description:   This class specifies the Staff object, that inherit
               from the Employee class and specifies the pay grade.
*/

public class Staff extends Employee {
   private int pay;
   
   // default constructor
   public Staff() {
      super(); // calls parent default constructor
      this.setPay(0);
   }
   
   // overloaded constructor
   public Staff (String name, int id, String dept, int pay) {
      super(name, id, dept); // calls parent overloaded constructor
      this.setPay(pay);
   }
   
   // mutator - change name, id, dept, and pay grade
   public void reset(String name, int id, String dept, int pay) {
      this.setName(name);
      this.setId(id);
      this.setDept(dept);
      this.setPay(pay);
   }
   
   // mutator - change staff pay grade
   public void setPay(int pay) {
      if (pay > 0 && pay < 21) {
         this.pay = pay;
      } else {
         System.out.println("Illegal pay grade value.");
         System.exit(0);
      }   
   }
   
   // accessor - get the staff pay grade
   public int getPay() {
      return this.pay;
   }
   
   // overrides the write output method to outputs the information for the user
   @Override
   public void writeOutput() {
      super.writeOutput();
      System.out.println("Pay grade: " + this.getPay());
   }
   
   // check if there's a faculty with same information
   public boolean equals(Staff otherStaff) {
      return (super.equals(otherStaff) && (this.getPay() == otherStaff.getPay()));
   }
   
   // overrides object toString() method
   @Override
   public String toString() {
      return "Name: " + this.getName() + "\nEmployee ID: " + this.getId() + "\nDepartment: " + this.getDept() + "\nPay grade: " + this.getPay();
   }

   
}
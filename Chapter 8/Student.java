/*
Program:       Student
Author:        Fabricio Teixeira
Date:          04/25/2017
Description:   This class specifies the Employee object, that inherit
               from the Person class and specifies the student number.
*/

public class Student extends Person {
   private int studentNumber;
   
   // default constructor
   public Student() {
      super(); // calls parent default constructor
      this.setStudentNumber(0); // calls student number setter method
   }
   
   // overloaded constructor
   public Student(String name, int studentNumber) {
      super(name); // calls parent overloaded constructor
      this.setStudentNumber(studentNumber);
   }
   
   // mutator - change name and student number
   public void reset(String name, int studentNumber) {
      this.setName(name);
      this.setStudentNumber(studentNumber);
   }
   
   // mutator - change only student number
   public void setStudentNumber(int studentNumber) {
      this.studentNumber = studentNumber;
   }
   
   // accessor - get the student's number
   public int getStudentNumber() {
      return this.studentNumber;
   }
   
   // overrides the write output method to outputs the information for the user
   @Override
   public void writeOutput() {
      super.writeOutput();
      System.out.println("Student number: " + this.getStudentNumber());
   }
   
   // check if there's a student with same name and same number
   public boolean equals(Student otherStudent) {
      return (this.hasSameName(otherStudent) && (this.getStudentNumber() == otherStudent.getStudentNumber()));
   }
   
   // overrides object toString() method
   @Override
   public String toString() {
      return "Name: " + this.getName() + "\nStudent number: " + this.getStudentNumber();
   }
   
   /* // For optional section
   public boolean equals(Object otherObject)
   {
   }
   */
}
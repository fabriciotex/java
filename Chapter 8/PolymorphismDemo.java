/*
Program:       PolymorphismDemo
Author:        Fabricio Teixeira
Date:          04/25/2017
Description:   This class tests the implementation of the Person, Student
               Undergraduate, Employee, Faculty, and Staff classes.
*/

public class PolymorphismDemo {
   public static void main(String[] args) {
      
      Person[] people = new Person[8];
      people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
      people[1] = new Undergraduate("Kick, Anita", 9931, 2);
      people[2] = new Student("DeBanque, Robin", 8812);
      people[3] = new Undergraduate("Bugg, June", 9901, 4);
      people[4] = new Employee ("Doe, John", 777, "IT");
      people[5] = new Employee ("Doe, Jane", 888, "Finance");
      people[6] = new Faculty ("Skywalker, Luke", 999, "IT", "Professor");
      people[7] = new Staff ("Solo, Han", 000, "Garage", 17);      
            
      for (Person p : people) {
         p.writeOutput();
         System.out.println();
      }
      
   }
}
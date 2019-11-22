/*
Program:       PolymorphismDemo
Author:        Fabricio Teixeira
Date:          04/25/2017
Description:   This class tests the implementation of the Person, Student
               Undergraduate, Employee, Faculty, and Staff classes.
*/

// temp testing class
public class PolymorphismDemo {
   public static void main(String[] args) {
      // create student object
      //Student s1 = new Student("John Doe", 555);
      //Student s2 = new Student("Jane Doe", 555);
      //Student s3 = new Student("Fabricio Teixeira", 777);
      //Undergraduate u1 = new Undergraduate("Fabricio Teixeira", 777, 2);
      
      // display student information
      // s1.writeOutput();
      // s2.writeOutput();
      
      // set student name
      // s1.setName("Fabricio Teixeira");
      // s1.setStudentNumber(777);
      
      // display student information
      // u1.writeOutput();
      
      // System.out.println(s1.equals(s3));
      
      Person[] people = new Person[8];
      people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
      people[1] = new Undergraduate("Kick, Anita", 9931, 2);
      people[2] = new Student("DeBanque, Robin", 8812);
      people[3] = new Undergraduate("Bugg, June", 9901, 4);
      people[4] = new Employee ("Doe, John", 777, "IT");
      people[5] = new Employee ("Doe, Jane", 888, "Finance");
      people[6] = new Faculty ("Skywalker, Luke", 999, "IT", "Professor");
      people[7] = new Staff ("Solo, Han", 000, "Garage", 17);      
      
      /*
      Employee a = new Employee("Cotty, Manny", 4910, "Finance");
      Employee b = new Employee("Cotty, Manny", 4910, "Finance");
      
      System.out.println(a + "\n" + b);
      System.out.println(a.equals(b));
      
      Undergraduate c = new Undergraduate("DeBanque, Robin", 8812, 4);
      Undergraduate d = new Undergraduate("DeBanque, Robin", 8812, 4);
      
      System.out.println(c + "\n" + d);
      System.out.println(c.equals(d));
      
      Faculty e = new Faculty("DeBanque, Robin", 8812, "Finance", "Specialist");
      Faculty f = new Faculty("DeBanque, Robin", 8812, "Finance", "Specialist");
      
      System.out.println(e + "\n" + f);
      System.out.println(e.equals(f));
      
      Staff g = new Staff("DeBanque, Robin", 8812, "Finance", 8);
      Staff h = new Staff("DeBanque, Robin", 8812, "Finnce", 21);
      
      System.out.println(g + "\n" + h);
      System.out.println(g.equals(h));
      */
      
      for (Person p : people) {
         p.writeOutput();
         System.out.println();
      }
      
   }
}
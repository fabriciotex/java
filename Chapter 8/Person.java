/*
Program:       Person
Author:        Fabricio Teixeira
Date:          04/25/2017
Description:   This class specifies the Person object, that is the base
               for all the other object to implement defining the name,
               write ouput and a compare method.
*/

public class Person {
   private String name;
   
   // default constructor
   public Person() {
      this.setName("No name yet");
      // this.name = "No name yet";
   }
   
   // overloaded constructor
   public Person(String name) {
      this.setName(name);
   }   
   
   // mutator - set the person's name
   public void setName(String name) {
      this.name = name;
   }
   
   // accessor - get the person's name
   public String getName() {
      return this.name;
   }
   
   // outputs the information for the user
   public void writeOutput() {
      System.out.println("Name: " + this.name);
   }
   
   // check if has two persons with same name
   public boolean hasSameName(Person otherPerson) {
      return(this.getName().equalsIgnoreCase(otherPerson.getName())); 
   }
}
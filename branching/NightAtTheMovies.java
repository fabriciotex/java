/************************************************************/
/* Program: NightAtTheMovies                                */
/* CIS163AA                                                 */
/* Fabricio Teixeira                                        */
/* 2/16/2017                                                */
/* This program evaluates if a person can go to the movies  */
/* and how much it will be charged.                         */
/************************************************************/
import java.util.Scanner;

public class NightAtTheMovies { 
   public static void main(String[] args) {
   
      // create a new Scanner object
      Scanner scnr = new Scanner(System.in);
      
      // initialize variables
      String name = "";
      int age = 0, ticket = 15;
      
      // print program description
      System.out.println("John wishes to go to a movie with his two friends, Sam, and Bob.\nJohn is 15, Sam is 18, and Bob is 67\nWould they be able to?");      

      // prompts the user to enter a string for the person's name
      System.out.print("Enter the person's name: ");
      name = scnr.next();
      
      // prompts the user to enter an integer for the person's age
      System.out.printf("Enter the %s's age: ", name);
      age = scnr.nextInt();
      
      // evaluates the age value and prints the correspondent string
      if (age < 18) {
         //System.out.printf("%s cannot see the movie\n", name);
         System.out.println(name + " cannot see the movie.");
      } else if (age >= 65) {
         ticket -= 10;
         //System.out.printf("%s will be charged $%d\n", name, ticket);
         System.out.println(name + " will be charged $" + ticket);
      } else {
         System.out.printf("%s will be charged $%d\n", name, ticket);
      }

   }
}
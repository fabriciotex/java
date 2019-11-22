/*
Program:       Candy Calculator 3
Author:        Fabricio Teixeira
Date:          02/14/2017
Description:   This program is a simple candy bar calculator 
               to maintain weight based on Harris-Benedict equation.
               This program prints the answer based on gender description
               and active status.
*/

import java.util.Scanner;

public class CandyCalculator3 {
   public static void main(String[] args) {
      
      // create the scanner object
      Scanner scnr = new Scanner(System.in);
      
      // declare and initialize variables
      int age = 0, weight = 0, height = 0;
      String gender = "", status = "", gen = "", result = "";
      double calories = 0.0, numBars = 0.0;
      
      // print the program description
      System.out.println("This program will calculate the number of 230 calorie candy bars to consume to maintain your weight.");
      
      // prompt the user to input his/her age and waits for an integer input
      System.out.println("What is your age in years?");
      age = scnr.nextInt();
      
      // prompt the user to input his/her wight and waits for an integer input
      System.out.println("What is your weight in pounds?");
      weight = scnr.nextInt();
      
      // prompt the user to input his/her height and waits for an integer input
      System.out.println("What is your height in inches?");
      height = scnr.nextInt();
      
      // prompt the user to input his/her gender and waits for a string input
      System.out.println("What is your gender? (Type 'M' for male or 'W' for female)" );
      gender = scnr.next();
      gender = gender.toUpperCase();
      
      // checks gender options            
      if (gender.equals("W")) {
         // sets gen string
         gen = "her";
         
         // calculate calories
         calories = (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));
         
         // number of 230 calorie bars for a woman to maintain her weight
         numBars = calories/230;
         
         // print the result for a woman on the screen
         result = "A woman with those measurements should eat ";
      } else if (gender.equals("M")) {
         // sets gen string
         gen = "his";

         // calculate calories
         calories = (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));
            
         // print the result for a man on the screen
         result = "A man with those measurements should eat ";
      } else {
         System.out.print("You did not input a valid gender!");
         System.exit(0);
      }
      
       // prompt the user to input his/her active state and waits for a string input
      System.out.println("What is your active state?\n'S' - sedentary\n'W' - somewhat active\n'A' - active\n'H' - highly active" );
      status = scnr.next();
      status = status.toUpperCase();
            
      // checks status options
      switch (status) {
         case "S":
            calories *= 1.2;
            break;
         case "W":
            calories *= 1.3;
            break;
         case "A":
            calories *= 1.4;  
            break;
         case "H":
            calories *= 1.5;
            break;
         default:
            System.out.print("You did not input a valid option.");
            System.exit(0);
      }

      // prints number of 230 calorie bars for to maintain his/her weight
      numBars = calories/230;
      
      // format result string to print numBars with one decimal place
      result += String.format("%.1f", numBars) + " candy bars to maintain " + gen + " weight.";
      System.out.println(result);

   }
}
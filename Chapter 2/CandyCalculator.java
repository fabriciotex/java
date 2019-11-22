/*
Program:       Candy Calculator
Author:        Fabricio Teixeira
Date:          02/11/2017
Description:   This program is a simple candy bar calculator 
               to maintain weight based on Harris-Benedict equation.
*/

import java.util.Scanner;

public class CandyCalculator {
   public static void main(String[] args) {
      
      // create the scanner object
      Scanner scnr = new Scanner(System.in);
      // declare and initialize int variables
      int age = 0, weight = 0, height = 0;

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
      
      // initialize double variable
      double numBars = 0.0;
      
      // number of 230 calorie bars for a woman to maintain her weight
      numBars = (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age))/230;
      
      // print the result for a woman on the screen
      System.out.format("A woman with those measurements should eat %.1f candy bars to maintain her weight.\n", numBars);
      
      // number of 230 calorie bars for a man to maintain his weight
      numBars = (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age))/230;
      
      // print the result for a man on the screen
      System.out.format("A man with those measurements should eat %.1f candy bars to maintain his weight.\n", numBars);
   }
}
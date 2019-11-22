/************************************************************/
/* Program: NewCalculator                                   */
/* CIS163AA                                                 */
/* Fabricio Teixeira                                        */
/* 3/2/2017                                                 */
/* This program is a simple calculator that does the        */
/* basic operations (Multiplication, Division, Addition &   */
/* Subtraction) based on two numbers entered by the user.   */
/************************************************************/

import java.util.Scanner;

public class NewCalculator {

   // method for doing subtraction between two numbers
   public static double doSub(double n1, double n2) {
      return n1 - n2;
   }

   // method for doing addition between two numbers
   public static double doAdd(double n1, double n2) {
      return n1 + n2;
   }

   // method for doing division between two numbers
   public static double doDiv(double n1, double n2) {
      return n1 / n2;
   }

   // method for doing multiplication between two numbers
   public static double doMult(double n1, double n2) {
      return n1 * n2;
   }
   
   // method for validating the second number in a division by zero
   public static double validateNum(String input, double num) {
      while (input.equals("D") && num == 0) {
         System.out.print("Can't divide by zero, try another number: ");
         num = getNumber();
      }
               
      return num;
   }
   
   // method for getting double input from keyboard
   public static double getNumber() {
      boolean isDouble = true;
      String input = "";
      Scanner scnr = new Scanner(System.in);
      
      do {
      
         input = scnr.next();
         isDouble = true;
         
         // check if the collected string can be parsed as a double
         try {
            Double.parseDouble(input);
         } catch(NumberFormatException nfe) {
            isDouble = false;
            System.out.print("Invalid number. Try another value: ");
         }
               
      } while(!isDouble);
      
      return Double.parseDouble(input);
   }
   
   // method for getting string input from keyboard
   public static String getInput() {
      String input = "";
      Scanner scnr = new Scanner(System.in);
      
      // validate input for operation
      do {
         input = scnr.next().toUpperCase();
         
         if (!input.equals("M") && !input.equals("D") && !input.equals("A") && !input.equals("S")) {
            System.out.println("Invalid option. Try again.");
         }
      } while (!input.equals("M") && !input.equals("D") && !input.equals("A") && !input.equals("S"));
       
      return input;
   }
   
   // main method
   public static void main(String[] args) {
      
      // initialize variables
      String usrInput = "";
      double num1 = 0.0, 
             num2 = 0.0,
             result = 0.0;
            
      // prints program description on screen
      System.out.println("Welcome to Simple Calculator 2.0");
      System.out.println("Please enter the desired operation:");
      System.out.println("(M)ultiplication, (D)ivision, (A)ddition, or (S)ubtraction");
      
      // call get input method
      usrInput = getInput();
      
      System.out.print("Enter the first number: ");
      num1 = getNumber();
      
      System.out.print("Enter the second number: ");
      num2 = getNumber();
            
      // validate num2
      num2 = validateNum(usrInput, num2);
      
      // check the user input and calls the method for the selected operation
      switch (usrInput) {
         case "M":
            result = doMult(num1, num2);
            break;
         case "D":
            result = doDiv(num1, num2);
            break;
         case "A":
            result = doAdd(num1, num2);
            break;
         case "S":
            result = doSub(num1, num2);
            break;
         default:
            System.out.print("Invalid option.");
      }
      
      // prints the result on screen
      System.out.println("The result is: " + result);
                
   }
}
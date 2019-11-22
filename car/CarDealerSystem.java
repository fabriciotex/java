/************************************************************/
/* Program: CarDealerSystem                                 */
/* CIS163AA                                                 */
/* Fabricio Teixeira                                        */
/* 3/12/2017                                                */
/* This program can record a new car in the system or       */
/* print the default car recorded in the system.            */
/************************************************************/

import java.util.Scanner;

public class CarDealerSystem{

   // get validated double input from keyboard
   public static double getDouble() {
      boolean isDouble = true;
      String input = "";
      
      do {
         input = getString();
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


   // get string input from keyboard
   public static String getString() {
      Scanner scnr = new Scanner(System.in);
      return scnr.next();
   }

   // get validated integer input from keyboard
   public static int getInt() {
      boolean isInteger = true;
      String input = "";
      
      do {
         do {
            input = getString();
            isInteger = true;
            
            // check if the collected string can be parsed as an Integer
            try {
               Integer.parseInt(input);
            } catch(NumberFormatException nfe) {
               isInteger = false;
               System.out.print("Invalid number. Try another value: ");
            }
                  
         } while(!isInteger);
         
         if (Integer.parseInt(input) < 1920 || Integer.parseInt(input) > 2018) {
            System.out.print("Enter the year in the range 1920 - 2018. Try again: ");
         }
      } while(Integer.parseInt(input) < 1920 || Integer.parseInt(input) > 2018);

      return Integer.parseInt(input);
   }

   // print car information on screen
   public static void printCar(Car car) {
      System.out.println("Year: " + car.getYear());
      System.out.println("Make: " + car.getMake());
      System.out.println("Model: " + car.getModel());
      System.out.println("Color: " + car.getColor());
      System.out.println("Top Speed: " + car.getTopSpeed() + " mph");
      printLine();
   }
   
   // record new car in inventory
   public static void recordCar(Car car) {
      System.out.print("Enter the car's year: ");
      car.setYear(getInt());
      System.out.print("Enter the car's make: ");
      car.setMake(getString());
      System.out.print("Enter the car's model: ");
      car.setModel(getString());
      System.out.print("Enter the car's color: ");
      car.setColor(getString());
      System.out.print("Enter the car's top speed (in mph): ");
      car.setTopSpeed(getDouble());
   }
   
   // get validated menu command
   public static String getCommand() {
      String input = "";
      
      do {
         input = getString().toUpperCase();
         
         // check if the command input is one of the valid options
         if (!input.equals("R") && !input.equals("P") && !input.equals("Q")) {
            System.out.print("Invalid option. Try again: ");
         }
      } while (!input.equals("R") && !input.equals("P") && !input.equals("Q"));
      
      return input;
   }

   // print menu for user
   public static void menu() {
      Scanner scnr = new Scanner(System.in);
      Car car = new Car();
      
       while(true) {
         System.out.println("(R)ecord a new car | (P)rint car information | (Q)uit");
      
         switch(getCommand()) {
            case "R":
               recordCar(car);
               break;
            case "P":
               printCar(car);
               break;
            case "Q":
               System.exit(0);
               break;
            default:
               System.out.println("Invalid option.");
         }
      }
      
   }
   
   // print line on screen
   public static void printLine() {
      for (int i = 0; i < 55; i++) {
         System.out.print("-");
      }
      System.out.println("");
   }

   // main method
   public static void main(String[] args) {
      System.out.println("Welcome to the Dealership System");
      
      printLine();
      
      menu();
      
   }
}
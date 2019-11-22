/************************************************************/
/* Program: ArrayCreator                                    */
/* CIS163AA                                                 */
/* Fabricio Teixeira                                        */
/* 3/2/2017                                                 */
/* This program creates an array of random numbers          */
/* based on the user input for the array size.              */
/************************************************************/
import java.util.Scanner;

public class ArrayCreator { 
   public static void main(String[] args) {
   
      // create new Scanner object
      Scanner scnr = new Scanner(System.in);
      
      // initialize variables
      int arrLength = 0;
      
      
      // prints program description
         System.out.println("This program will create an array of random numbers from 0 to 9.");
         System.out.println("Please enter the desired number (whole) of elements in your array. (Max size: 10)");
      
      // validate input
      do {
         // get user input from keyboard
         arrLength = scnr.nextInt();
         
         // if the input number is not in the range prints error message
         if (arrLength > 10 || arrLength < 0) {
            System.out.println("Invalid value. Try another number.");
         }
      } while (arrLength > 10 || arrLength < 0);
      
      // create array based on user input
      int[] userArray = new int[arrLength];
      
      // generate random number and puts into the array
      for (int i = 0; i < arrLength; ++i) {
         userArray[i] = (int) Math.floor(Math.random() * 10);
      }
      
      // start printing the array string
      System.out.print("Your array is: [");
      
      // loop through the elements and prints them
      for (int i = 0; i < arrLength; ++i) {
         if(i == arrLength - 1) {
            System.out.print(userArray[i]);
         } else {
            System.out.print(userArray[i] + ", ");
         }
      }
      
      // prints bracket to close array string  
      System.out.print("]");
      
   }
}
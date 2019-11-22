/**************************************************************/
/* Program: GuessingGame                                      */
/* CIS163AA                                                   */
/* Fabricio Teixeira                                          */
/* 4/14/2017                                                  */
/* This program is a guessing game, based on the user input   */
/* saying that the thought number is lower, higher or exaclty */
/* the guess prompted by the computer.                        */
/**************************************************************/

import java.util.Scanner;

public class GuessingGame {

   // get user input
   public static char getInput() {
      Scanner scnr = new Scanner(System.in);
      Character guess;
      
      // validate input if is letter
      do {
         guess = scnr.next().charAt(0);
         guess = Character.toUpperCase(guess);
         
         // if option is not valid throw an exception
         try {
            if((!Character.isLetter(guess)) || ((guess != 'L') && (guess !='H') && (guess != 'Y'))) {
               throw new Exception ("Invalid command");
            }
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }
         
      } while((!Character.isLetter(guess)) || ((guess != 'L') && (guess !='H') && (guess != 'Y')));
      
      
      return guess;
   }

   // guessing method
   public static void guessFrom(int minVal, int maxVal) {
      int midVal = 0;
      char guess = '?';
      
      // sets the middle value for comparison
      midVal = (minVal + maxVal) / 2;
      
      System.out.println("Is it " + midVal + "?");
      
      // asks user for input
      guess = getInput();
      
      // branch decision based on user input
      if (guess == 'L') {
         guessFrom(minVal, midVal);
      } else if (guess == 'H') {
         guessFrom(midVal + 1, maxVal);
      } else {
         System.out.println("Bingo!");
      }
   }
   
   //  main method
   public static void main(String[] args) {
      
      System.out.printf("Guessing Game 1.0\nThink of a number from 0 to 100\nTo every attempt to guess you answer with\n'L' if the number is lower than the one guessed,\nwith 'H' if the number is higher,\nand with 'Y' for Yes! You're good at it!\n");
      // calls guessing method
      guessFrom(0, 100);
   }
}
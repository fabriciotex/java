/*************************************************************/
/* Program: CoinCalculator                                   */
/* CIS163AA                                                  */
/* Fabricio Teixeira                                         */
/* 2/18/2017                                                 */
/* This program is a coin calculator that outputs the number */
/* of coins in a change for a dollar.                        */
/*************************************************************/
import java.util.Scanner;

public class CoinCalculator { 
   public static void main(String[] args) {
   
      // create new Scanner object
      Scanner scnr = new Scanner(System.in);
      
      // initialize integers variables
      int cents = 0, 
          half = 0, 
          quarter = 0,
          dime = 0,
          nickel = 0,
          penny = 0;
      
      // validate input prompting the user while the answer is not in the range
      do {
         System.out.print("Enter the value of change in cents (1 - 99): ");
         cents = scnr.nextInt();
         if ((cents < 1) || (cents > 99)) {
            System.out.println("Your value is not between the range 1 - 99.");
         }
      } while((cents < 1) || (cents > 99));
      
      // outputs string for showing the result
      System.out.println("Your change is:");
      
      // calculate the number of each coin
      // if there is at least one coin per value
      // outputs the number of coins
      half = cents / 50;
      cents %= 50;
      
      if (half > 0) {
         System.out.printf("\t%d half dollar\n", half);
      }
            
      quarter = cents / 25;
      cents %= 25;
      if (quarter > 0) {
         System.out.printf("\t%d quarter dollar\n", quarter);
      }
      
      dime = cents / 10;
      cents %= 10;
      if (dime > 1) {
         System.out.printf("\t%d dimes\n", dime);
      } else if (dime > 0) {
         System.out.printf("\t%d dime\n", dime);
      }
      
      nickel = cents / 5;
      cents %= 5;
      if (nickel > 1) {
         System.out.printf("\t%d nickels\n", nickel);
      } else if (nickel > 0) {
         System.out.printf("\t%d nickel\n", nickel);
      }
      
      penny = cents / 1;
      cents %= 1;
      if (penny > 1) {
         System.out.printf("\t%d pennies\n", penny);
      } else if (penny > 0) {
         System.out.printf("\t%d penny\n", penny);
      }
      
   }
}
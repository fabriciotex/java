/*
Program:       NegativeAmountException
Author:        Fabricio Teixeira
Date:          04/25/2017
Description:   This class defines the exception for when the amount
               to withdraw is greater than the current balance.
*/

public class InsufficientBalanceException extends Exception {

   public InsufficientBalanceException() {
      super("Insufficient balance for withdrawal.");
   }
   
} 
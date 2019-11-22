/*
Program:       NegativeAmountException
Author:        Fabricio Teixeira
Date:          04/25/2017
Description:   This class defines the exception for negative values.
*/

ublic class NegativeAmountException extends Exception {

   public NegativeAmountException() {
      super("Negative amounts not allowed.");
   }
   
}
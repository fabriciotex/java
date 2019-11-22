/*
Program:       Account
Author:        Fabricio Teixeira
Date:          04/25/2017
Description:   This program calculates the balance of an account after a 
               deposit or withdrawal, dealing with the possible errors
               on its values, throwing exceptions that will tell the user
               what the error is in a friendly way.
*/

public class Account {
   private double balance;

   public Account() {
      balance = 0;
   }
   
   public Account(double initialDeposit) {
      balance = initialDeposit;
  }
  
   public double getBalance() {
      return balance;
   }
   
   // returns new balance or -1 if error
   public double deposit(double amount) throws NegativeAmountException {
      if (amount > 0)
         balance += amount;
      else
         //return -1; // Code indicating error
         throw new NegativeAmountException();
      return balance;
   }
   
   // returns new balance or -1 if invalid amount
   public double withdraw(double amount) throws NegativeAmountException, InsufficientBalanceException {
      
      if (amount > balance)
         throw new InsufficientBalanceException();
      else if (amount < 0)
         throw new NegativeAmountException();
      else
         balance -= amount;
      
      return balance;
   }
   
   public static void main(String[] args) {
      Account a = new Account(10);
      try {
         a.deposit(100);
         a.withdraw(-50);
         System.out.println(a.getBalance());
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}
/*
Program:       Grade Scores
Author:        Fabricio Teixeira
Date:          02/28/2017
Description:   This program will give letter grades based on score inputs.
*/

import java.util.Scanner;

public class GradeScores {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      int grade = 0, a = 0, b = 0, c = 0, d = 0, f = 0, count = 0;
      
      System.out.print("This program will give letter grades based on score inputs.\nYou must input whole scores from 0 - 100, to exit input any negative value.\nInput the first value: ");
   
      do {
         grade = scnr.nextInt();
         
         if (grade >= 90) {
            ++a;
         } else if (grade < 90 && grade >= 80) {
            ++b;
         } else if (grade < 80 && grade >= 70) {
            ++c;
         } else if (grade < 70 && grade >= 60) {
            ++d;
         } else if (grade < 60 && grade >= 0) {
            ++f;
         }
         
         if (grade >= 0) {
            ++count;
            System.out.print("Input the next value: ");
         } else {
            System.out.println("\nYou've input a negative value.\nCalculating...");
         }
         
      } while(grade >= 0);
      
      System.out.printf("\nTotal number of grades = %d\nNumber of A's = %d\nNumber of B's = %d\nNumber of C's = %d\nNumber of D's = %d\nNumber of F's = %d\n", count, a, b, c, d, f);
      
   }
}
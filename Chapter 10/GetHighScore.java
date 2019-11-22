/*
Program:       GetHighScore
Author:        Fabricio Teixeira
Date:          05/02/2017
Description:   This program reads a list of integers on a file
               and outputs the highest value.
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GetHighScore {

   public static void main(String[] args) {
      String inputFile = "input.txt";
      Scanner inputStream = null;
      int highest = 0;
      
      try {
         inputStream = new Scanner(new File(inputFile));
      } catch(FileNotFoundException e) {
         System.out.println("Error opening the file " + inputFile);
         System.exit(0);
      }
      
      while (inputStream.hasNextLine()) {
         int input = inputStream.nextInt();
         if (input > highest) {
            highest = input;
         }
      }
      inputStream.close();
      
      System.out.println("High score is: " + highest);
   }
}
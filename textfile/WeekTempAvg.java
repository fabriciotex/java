/*************************************************************/
/* Program: WeekTempAvg                                      */
/* CIS163AA                                                  */
/* Fabricio Teixeira                                         */
/* 4/4/2017                                                  */
/* This program reads data weekly temperature averages from  */
/* a file and calculates the week average and saves it on    */
/* another file.                                             */
/*************************************************************/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class WeekTempAvg {
   public static void main(String[] args) throws IOException {
   
      // create the objects for input
      FileInputStream input = null;
      Scanner scnr  = null;
      
      // create the objects for output
      FileOutputStream output = null;
      PrintWriter prntr = null;
      
      // create the variables
      double[] temperatures = new double[7];
      double average = 0.0;
      
      // import file to program
      System.out.println("Importing the week data...");
      input = new FileInputStream("rawData.txt");
      scnr = new Scanner(input);
      
      // loop the file data to load the array
      System.out.println("Getting the week temperature daily average..");
      System.out.print("Temperatures for the week: ");
      for (int i = 0; i < temperatures.length; i++) {
         temperatures[i] = scnr.nextDouble();
         if (i == (temperatures.length - 1)) {
            System.out.print(temperatures[i] + "°F");
         } else {
            System.out.print(temperatures[i] + "°F, ");
         }
         average += temperatures[i];
      }
      //calculate the average
      average /= 7;
      
      // close input file
      input.close();
      
      // print information to the user
      System.out.printf("\nThe week temperature average is %.2f°F", average);
      
      // save information in the processedData file
      System.out.println("\n\nSaving week data...");
      output = new FileOutputStream("processedData.txt");
      prntr = new PrintWriter(output);
      
      // prints information on the file
      prntr.printf("The week temperature average is %.2f°F", average);
      prntr.println("\n\nData processed by WeekTempAvg");
      prntr.flush();
      
      // close output file
      output.close();
      
      // prints successful operation flag on screen
      System.out.println("Data successfully saved in processedData.txt");
   }
}
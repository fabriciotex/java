/*************************************************************/
/* Program: BallInventory                                    */
/* CIS163AA                                                  */
/* Fabricio Teixeira                                         */
/* 4/6/2017                                                  */
/* This program creates an array of Ball objects and add the */
/* created objects in order to print information of all the  */
/* objects in the array.                                     */
/*************************************************************/

import java.util.ArrayList;

public class BallInventory {
   public static void main(String[] args) {
      // creates array list to list the balls in inventory
      ArrayList<Ball> inventory = new ArrayList<Ball>();
      
      // instantiate and initialize the objects
      Ball tennisBall = new TennisBall("tennis ball", "optic yellow", 2.5);
      Ball basketBall = new BasketBall("basketball", "orange", 4.615);
      Ball footBall = new FootBall("football", "brown", 5.5, (11/Math.PI));
      
      // adds the objects on the array list
      inventory.add(tennisBall);
      inventory.add(basketBall); 
      inventory.add(footBall);
      
      // calls the printInfo() method to show the user information about the objects
      for (Ball item : inventory) {
         item.printInfo();
      }
   }
}
/*
Program:       RoomTester
Author:        Fabricio Teixeira
Exercise:      Chapter 6, page 474, ex 6 & 7
Date:          03/28/2017
Description:   This class tests the methods in the RoomOcupancy class,
               manipulating the private variables with the described
               methods and accessing the static methods and variables.
*/

public class RoomTester {
   public static void main (String[] args) {
      // create objects
      RoomOccupancy_teixeira roomA = new RoomOccupancy_teixeira();
      RoomOccupancy_teixeira roomB = new RoomOccupancy_teixeira();
      
      // prompts and adds people to the rooms
      System.out.println("Add one to room a and three to room b.");
      roomA.addOneToRoom();
      roomB.addOneToRoom();
      roomB.addOneToRoom();
      roomB.addOneToRoom();
      
      // get number of people in each room
      System.out.println("Room a holds " + roomA.getNumber());
      System.out.println("Room b holds " + roomB.getNumber());
      
      // gets total number of people in building
      System.out.println("Total in all rooms is: " + RoomOccupancy_teixeira.getTotal());
      
      // prompts and subtracts people to the rooms
      System.out.println("Remove one person from each room");
      roomA.removeOneFromRoom();
      roomB.removeOneFromRoom();
      
      // get number of people in each room
      System.out.println("Room a holds " + roomA.getNumber());
      System.out.println("Room b holds " + roomB.getNumber());
      
      // gets total number of people in building
      System.out.println("Total in all rooms is: " + RoomOccupancy_teixeira.getTotal());
   }

}
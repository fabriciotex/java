/*
Program:       RoomOcupancy
Author:        Fabricio Teixeira
Exercise:      Chapter 6, page 474, ex 6 & 7
Date:          03/28/2017
Description:   This class specifies the RoomOcupancy object used on RoomTester
               program, setting the number of people in a room and the total 
               number of people in the building, and having accessors and mutators
               both object and class methods. 
*/

public class RoomOccupancy_teixeira {

   // instance member
   private int numberInRoom;
   
   // class member
   private static int totalNumber = 0;
   
   // constructor
   public RoomOccupancy_teixeira() {
      numberInRoom = 0;
   }
   
   // adds one person to room
   public void addOneToRoom() {
      this.numberInRoom++;
      totalNumber++;
   }
   
   // remove one person from room
   public void removeOneFromRoom() {
      if (this.numberInRoom > 0) {
         this.numberInRoom--;
         totalNumber--;
      }   
   }
   
   // get number of people in room
   public int getNumber() {
      return this.numberInRoom;
   }
   
   // get total number of people
   public static int getTotal() {
      return totalNumber;
   }
}
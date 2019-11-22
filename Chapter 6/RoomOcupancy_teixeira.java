/*
Program:       Room Ocupancy
Author:        Fabricio Teixeira
Exercise:      Chapter 6, page 474, ex 6 & 7
Date:          03/21/2017
Description:   This class specifies the Movie object used on MovieRating
               program, setting the name, MPAA rating, number of ratings
               on each category (terrible, bad, ok, good, and great) and
               calculates the average rating for the movie.
*/

public class RoomOcupancy_teixeira {

   // instance member
   private int numberInRoom;
   
   // class member
   private static int totalNumber = 0;
   
   // constructor
   public RoomOcupancy {
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
}
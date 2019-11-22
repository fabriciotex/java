/*
Program:       Movie
Author:        Fabricio Teixeira
Date:          04/04/2017
Description:   This class specifies the Movie object used on MovieRating
               program, setting the name, MPAA rating, number of ratings
               on each category (terrible, bad, ok, good, and great) saved
               in an array and calculates the average rating for the movie.
*/

public class Movie {
   // variables
   private String name;
   private String mpaa;
   private int[] ratings;
   private double ratingAvg;
               
   // default constructor
   public Movie() {
      this.name = "";
      this.mpaa = "";
      // create and initialize the array
      this.ratings = new int[5];
      for(int i = 0; i < this.ratings.length; i++) {
         this.ratings[i] = 0;
      }
      this.ratingAvg = 0.0;
   }
   
   // overloaded constructor
   public Movie(String name, String mpaa) {
      this.name = name;
      this.mpaa = mpaa;
      // create and initialize the array
      this.ratings = new int[5];
      for(int i = 0; i < this.ratings.length; i++) {
         this.ratings[i] = 0;
      }
      this.ratingAvg = 0.0;
   }
   
   // set the movie name
   public void setName(String name) {
      this.name = name;
   }
   
   // set the movie MPAA rating
   public void setMpaa(String mpaa) {
      this.mpaa = mpaa;
   }   
   
   // get the rating input and count on the category that it fits
   public void addRating(int rating) {
      switch (rating) {
         case 1: // terrible
            ratings[0]++;
            break;
         case 2: // bad
            ratings[1]++;
            break;
         case 3: // ok
            ratings[2]++;
            break;
         case 4: // good
            ratings[3]++;
            break;
         case 5: // great
            ratings[4]++;
            break;
         default:
            System.out.println("Invalid option.");            
      }
   }
   
   // return the movie name
   public String getName() {
      return this.name;
   }
   
   // return the movie MPAA rating
   public String getMpaa() {
      return this.mpaa;
   }   
   
   // return the rating average
   public double getAverage() {
      this.ratingAvg = (ratings[0] + (ratings[1] * 2) + (ratings[2] * 3) + (ratings[3] * 4) + (ratings[4] * 5)) / 5.0;
      return this.ratingAvg;
   }
}
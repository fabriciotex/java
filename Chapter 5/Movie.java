/*
Program:       Movie
Author:        Fabricio Teixeira
Date:          03/20/2017
Description:   This class specifies the Movie object used on MovieRating
               program, setting the name, MPAA rating, number of ratings
               on each category (terrible, bad, ok, good, and great) and
               calculates the average rating for the movie.
*/

public class Movie {
   // variables
   private String name;
   private String mpaa;
   private double rating;
   private int terrible,
               bad,
               ok,
               good,
               great;
               
   // default constructor
   public Movie() {
      this.name = "";
      this.mpaa = "";
      this.rating = 0.0;
      this.terrible = 0;
      this.bad = 0;
      this.ok = 0;
      this.good = 0;
      this.great = 0;
   }
   
   // overloaded constructor
   public Movie(String name, String mpaa) {
      this.name = name;
      this.mpaa = mpaa;
      this.rating = 0.0;
      this.terrible = 0;
      this.bad = 0;
      this.ok = 0;
      this.good = 0;
      this.great = 0;
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
         case 1:
            terrible++;
            break;
         case 2:
            bad++;
            break;
         case 3:
            ok++;
            break;
         case 4:
            good++;
            break;
         case 5:
            great++;
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
      this.rating = (terrible + (bad * 2) + (ok * 3) + (good * 4) + (great * 5)) / 5.0;
      return this.rating;
   }
}
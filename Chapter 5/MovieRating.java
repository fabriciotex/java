/*
Program:       MovieRating
Author:        Fabricio Teixeira
Date:          03/20/2017
Description:   This program creates movie objects that sets its name,
               MPAA rating, gets the ratings from viewers and prints the
               average rating.
*/

public class MovieRating {
   public static void main(String[] args) {
      // creates new movie object
      Movie m1 = new Movie("The Avengers", "PG-13");
      Movie m2 = new Movie("Batman v Superman: Dawn of Justice", "PG-13");
      
      // loops 5 times to set random ratings (1-5) to the movies
      for (int i = 0; i < 5; i++) {
         m1.addRating((int) Math.ceil(Math.random() * 5));
         m2.addRating((int) Math.ceil(Math.random() * 5));
      }
      
      // prints the movie information
      System.out.println("Movie: " + m1.getName());
      System.out.println("MPAA: " + m1.getMpaa());
      System.out.println("Rating: " + m1.getAverage());
      
      System.out.println("---------------------------------");
      
      System.out.println("Movie: " + m2.getName());
      System.out.println("MPAA: " + m2.getMpaa());
      System.out.println("Rating: " + m2.getAverage());
   }
}
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class WordLoader {
    private String word = "";
    private int count;

   String load() throws IOException {
       FileInputStream input;
       Scanner scnr;
       int selected;

      // initialize objects
      input = new FileInputStream("words.txt");
      scnr = new Scanner(input);
      
      // get random number of word
      selected = (int) Math.floor(Math.random() * 354985);
      
      // count number of lines in file
      while (scnr.hasNextLine() && count < selected) {
         word = scnr.nextLine();
         count++;
      }
      // close the file                 
      input.close();
      
      // return the word
      return word;
   }
}
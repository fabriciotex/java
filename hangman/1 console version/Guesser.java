import java.util.ArrayList;
import java.util.Scanner;

public class Guesser {
    private char[] filler = null;
    private String word = "";
    private char input = '?';
    private ArrayList<Character> tried = new ArrayList<>();

    // overloaded constructor
    Guesser(char[] filler, String word) {
        this.filler = filler;
        this.word = word;
    }

    // print array of chars
    public void printFiller() {
        System.out.println(filler);
    }

    // check if word has letter
    public boolean hasLetter() {
        return word.contains(input + "");
    }

    // get user input
    private void getUserInput() {
        System.out.print("\nInput a letter to guess: ");
        Scanner scnr = new Scanner(System.in);
        input = scnr.next().charAt(0);
    }

    // find letter in word and set its position into the char array
    public void guessLetter() {
        // find letter in word
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == input) {
                filler[i] = input;
            }
        }
    }

    // check if letter has already been tried before
    public boolean wasTried() {
        boolean bool = false;
        getUserInput();
        if (tried.contains(input)) {
            bool = true;
        } else {
            bool = false;
        }
        tried.add(input);
        return bool;
    }

    // check if the word was guessed
    public boolean isRight() {
        String toCompare = "";
        for (char c : filler) {
            toCompare += c;
        }
        return toCompare.equals(word);
    }
}
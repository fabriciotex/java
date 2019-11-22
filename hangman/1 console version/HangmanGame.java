import java.io.IOException;
import java.util.Scanner;

public class HangmanGame {

    // asks for user input
    private static void getMenu() throws IOException {
        // get user validated input
        if (getInput() == 'Q') {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            startGame();
        }

        System.out.println("Want to (P)lay again or (Q)uit?");
        getMenu();
    }
   
    // check and returns validated input
    private static char getInput() {
        Scanner keyboard = new Scanner(System.in);
        char input;

        do {
            input = keyboard.next().charAt(0);
            input = Character.toUpperCase(input);

             if (input != 'P' && input != 'Q') {
                System.out.println("Invalid option. Try again.");
             }
        } while (input != 'P' && input != 'Q');

        return input;
    }
      
    // prepare and start the game
    private static void startGame() throws IOException {
        // get word from file
        WordLoader loader = new WordLoader();
        String word = loader.load();

        // create filler array
        char[] filler = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
           filler[i] = '-';
        }

        // set player lives
        int lives = 5;

        // check if game is won
        boolean won = false;

        //create a new guesser
        Guesser guess = new Guesser(filler, word);

        // start guessing
        System.out.println("Let's start!");
        while (lives > 0 && !won) {
            guess.printFiller();
            if (!guess.wasTried()) {
                if (guess.hasLetter()) {
                    System.out.println("Good guess!\n");
                    guess.guessLetter();

                    // if all guessed change won
                    won = guess.isRight();
                } else {
                    lives--;
                    System.out.println("Nope! Remaining lives: " + lives + "\n");
                }
            } else {
                System.out.println("You already tried this letter.\n");
            }
        }

        // check game status
        if (lives == 0) {
            System.out.println("You lose!");
            System.out.println("The word to be guessed was " + word + "\n");
        } else if (won) {
            System.out.println("Good job!\n");
        }
    }

   // main method
    public static void main(String[] args) throws IOException {
        System.out.printf("Welcome to Hangman!\nSelect your option:\n(P)lay game\n(Q)uit game\n");
        getMenu();
    }
}
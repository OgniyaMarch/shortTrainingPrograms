package hangmanGameEnVersion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\tWelcome to Hangman");

        Scanner scanner = new Scanner(System.in);
        Hangman hangman = new Hangman();

        String userInput = null;
        boolean game = true;

        while(game){
            if(hangman.checkWin()) break;
            if(hangman.checkCounterOfMistakes()){

                System.out.println("Mistakes: " + hangman.getCounterMistakes());

                hangman.showWord();
                System.out.print("\nEnter letter: ");
                userInput = scanner.nextLine();

                if (userInput.length() == 1){
                    hangman.play(userInput);
                }

            }else break;

        }

        System.out.println("Game over");

    }
}

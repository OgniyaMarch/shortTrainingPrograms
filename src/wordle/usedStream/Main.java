package wordle.usedStream;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkerWithDictionary worker = new WorkerWithDictionary();
        Scanner scanner = new Scanner(System.in);

        String userInput;
        int trys = 1;

        while(true){
            System.out.println("It's " + trys + " try.");
            System.out.print("Enter word: ");
            userInput = scanner.nextLine().trim().toLowerCase();
            if (userInput.length() != 5) {
                continue;
            }
            if (trys == 6){
                System.out.println("You lose!");
                System.out.println(worker.getHiddenWord());
                break;
            }
            if (worker.checkContainsUserInputInDictionary(userInput)){
                if (worker.checkWin(userInput)){
                    System.out.println("You win");
                    break;
                }
                worker.printResultChecking(userInput);
                trys++;
            }else {
                System.out.println("This word isn't contained in dictionary");
            }
        }
    }
}

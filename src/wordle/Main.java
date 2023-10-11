package wordle;
//дописати перевірку користувацького вводу на наявність char символів які не є літерами
//дописати реалізацію виводу літер які знаходяться не на своєму місці

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean game = true;

        int counter = 1;
        WorkerWithDictionary worker = new WorkerWithDictionary();

        while(game){
            System.out.print("Enter 5-letter word: ");
            String userInputWord = scanner.nextLine().toLowerCase().trim();
            //word should have 5 letters
            if(userInputWord.length() == 5){
                //word should be in dictionary
                if(worker.checkContainsUserInputWord(userInputWord)){
                    if(worker.checkWin(userInputWord)){
                        System.out.println("You win");
                        game = false;
                        break;
                    }
                    else{
                        if(counter <= 6){
                            System.out.println("It's " + counter + " try");

                            worker.checkLetterOnPosition(userInputWord);

                            counter++;
                        }
                        else {
                            System.out.println("You lose");
                            System.out.println("Word: " + worker.getHiddenWord());
                            break;
                        }
                    }
                }
            }else System.out.println("You enter wrong word");
        }

    }
}

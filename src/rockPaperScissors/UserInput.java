package rockPaperScissors;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);
    public static String userInputHand(){
        System.out.print("Enter number: ");
        String userInput = scanner.nextLine();


        if (userInput.equals("1")){
            userInput = "Rock";
        }else if (userInput.equals("2")){
            userInput = "Paper";
        }else if (userInput.equals("3")){
            userInput = "Scissors";
        }else if(userInput.equalsIgnoreCase("x")){
            return "break";
        }else {
            System.out.println("Wrong input");
            return "error";
        }


        return userInput;
    }

}

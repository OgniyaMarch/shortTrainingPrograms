package numberGuessingGame;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);
    static String userInput;
    public static int inputNumber(){
        System.out.print("Enter number: ");
        userInput = scanner.nextLine();
        userInput.trim();

        //repeat while user doesn't enter integer
        int userNumber = parseUserStringToInt(userInput);
        if (userNumber == 0) inputNumber();
        return userNumber;
    }


    private static int parseUserStringToInt(String userInputString){
        int userNumber = 0;

        if (userInputString.isEmpty()) return 0;


        try{
            userNumber = Integer.parseInt(userInputString);
        }catch(NumberFormatException e){
            System.out.println("Enter integer");
            return 0;
        }

        return userNumber;
    }

}

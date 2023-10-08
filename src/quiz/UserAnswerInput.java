package quiz;


import java.util.Scanner;

public class UserAnswerInput {
    static Scanner scanner = new Scanner(System.in);

    public static String giveABCDanswer(){
        boolean userInput = false;
        String answer = null;
        while(!userInput){
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("a")){
                userInput = true;
            }else if (answer.equalsIgnoreCase("b")){
                userInput = true;
            }else if (answer.equalsIgnoreCase("c")){
                userInput = true;
            }else if (answer.equalsIgnoreCase("d")){
                userInput = true;
            }else{
                System.out.println("Wrong input. Try again");
            }
        }

        return answer;
    }
}

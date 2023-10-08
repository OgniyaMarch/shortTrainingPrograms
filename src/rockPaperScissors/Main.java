package rockPaperScissors;


public class Main {
    public static void main(String[] args) {
        int compScore = 0;
        int userScore = 0;

        System.out.println("\tRock Paper Scissors");
        System.out.println("""
                Enter:
                 1 - Rock
                 2 - Paper
                 3 - Scissors
                 x - exit""");

        while(true){
            HandOfComputer handOfComputer = new HandOfComputer();
            String userHand = UserInput.userInputHand();
            String compHand = handOfComputer.showHand();

            if(userHand.equalsIgnoreCase("break")){
                break;
            }if (userHand.equalsIgnoreCase("error")){
                continue;
            }

            System.out.println("You: " + userHand);
            System.out.println("Computer: " + compHand);

            int result = CheckingWinner.checkWinner(compHand, userHand);

            if(result == -1){
                compScore++;
            }else if(result == 1){
                userScore++;
            }

            System.out.println("User: " + userScore + "\nComputer: " + compScore);


        }

    }

}

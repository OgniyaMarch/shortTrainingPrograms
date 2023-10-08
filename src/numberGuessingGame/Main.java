package numberGuessingGame;



public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        int numberForGuessing = numberGenerator.getNumberForGuessing();

        boolean game = true;
        int counter = 0;

        while(game){
            int userNumber = UserInput.inputNumber();

            if(userNumber == numberForGuessing){
                System.out.println("You guess number");
                System.out.println("You spent " + counter + " times for guessing");
                game = false;
            }

            if(userNumber < numberForGuessing) System.out.println("Your number is less ");
            if(userNumber > numberForGuessing) System.out.println("Your number is more ");

            counter++;
        }
    }
}

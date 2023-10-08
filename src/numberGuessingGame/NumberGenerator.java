package numberGuessingGame;

import java.util.Random;

public class NumberGenerator {
    private int numberForGuessing;
    private Random random = new Random();
    NumberGenerator(){
        numberForGuessing = random.nextInt(99)+1;
    }

    public int getNumberForGuessing() {
        return numberForGuessing;
    }
}

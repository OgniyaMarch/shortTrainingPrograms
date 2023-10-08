package rockPaperScissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HandOfComputer {
    private List<String> computerHand = new ArrayList<>(3);
    HandOfComputer(){
        computerHand.add("Rock");
        computerHand.add("Paper");
        computerHand.add("Scissors");
    }

    public String showHand(){
        Random random = new Random();
        int index = random.nextInt(3);
        return computerHand.get(index);
    }
}

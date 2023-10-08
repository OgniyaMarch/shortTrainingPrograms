package diceRollingSimulator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("\tDice Rolling Simulator");
        Dice dice = new Dice();
        dice.showDiceSide(random.nextInt(7));
    }
}


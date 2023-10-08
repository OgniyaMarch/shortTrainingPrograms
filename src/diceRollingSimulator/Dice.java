package diceRollingSimulator;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    private final List<String> diceSide = new ArrayList<>();
    Dice(){
        diceSide.add(". . .\n" +
                ". 0 .\n" +
                ". . .\n");
        diceSide.add("0 . .\n" +
                ". . .\n" +
                ". . 0\n");
        diceSide.add("0 . .\n" +
                ". 0 .\n" +
                ". . 0\n");
        diceSide.add("0 . 0\n" +
                ". . .\n" +
                "0 . 0\n");
        diceSide.add("0 . 0\n" +
                ". 0 .\n" +
                "0 . 0\n");
        diceSide.add("0 . 0\n" +
                "0 . 0\n" +
                "0 . 0\n");
    }

    public void showDiceSide(int side) {
        System.out.println(diceSide.get(side));
    }
}

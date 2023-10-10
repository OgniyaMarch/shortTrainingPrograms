package hangmanGameEnVersion;

import java.util.ArrayList;
import java.util.List;

public class Hangman {
    private List<Character> secretWord = new ArrayList<>();
    private List<String> guessedChars = new ArrayList<>();
    private int counterMistakes = 0;
    private final int MAXCountMistakes = 10;
    Hangman(){
        VocabularyForGame voc1 = new VocabularyForGame();
         secretWord = voc1.getRandomWord();
         hideWord();
    }
    public void showWord(){
        for(int i = 0; i < secretWord.size(); i++){
            System.out.print(guessedChars.get(i));
        }
    }
    private void hideWord(){
        String hiddenPart = "_";
        for(int i = 0; i < secretWord.size(); i++){
            guessedChars.add(hiddenPart);
        }
    }
    public void play(String userInputLetter){
        if(!secretWord.contains(userInputLetter.charAt(0))){
            counterMistakes++;
        }else
        {
            for(int i = 0; i < secretWord.size(); i++){

                if(userInputLetter.equalsIgnoreCase(String.valueOf(secretWord.get(i)))){
                    guessedChars.set(i, userInputLetter);
                }
            }
        }

    }
    public boolean checkWin(){
        if(!guessedChars.contains("_")){
            System.out.println("You win");
            return true;
        }
        return false;
    }
    public boolean checkCounterOfMistakes(){
        return counterMistakes <= MAXCountMistakes;
    }
    public int getCounterMistakes() {
        return counterMistakes;
    }
}
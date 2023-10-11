package hangmanGameEnVersion;

import java.util.ArrayList;
import java.util.List;

public class Hangman {
    //contains the word to be guessed and the user cannot see it.
    private List<Character> secretWord;
    //contains the characters that the user guessed
    private List<String> guessedChars = new ArrayList<>();
    private List<String> usedChars = new ArrayList<>();

    private int counterMistakes = 0;
    private final int MAXCountMistakes = 10;
    Hangman(){
        ListWordsForGame generatedWord = new ListWordsForGame();
         secretWord = generatedWord.getRandomWord();
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
        //checks that the word does not contain a character
        if(!secretWord.contains(userInputLetter.charAt(0))){
            //avoid repeating the character
            if(!usedChars.contains(userInputLetter)){
                usedChars.add(userInputLetter);
                counterMistakes++;
            }
        }else{
            //open all the places where the letter occurs
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
        return counterMistakes < MAXCountMistakes;
    }
    public int getCounterMistakes() {
        return counterMistakes;
    }

    public StringBuilder getSecretWord() {
        StringBuilder tempGuessedWord = new StringBuilder();
        for(int i = 0; i < secretWord.size(); i++){
            tempGuessedWord.append(secretWord.get(i));
        }
        return tempGuessedWord;
    }

    public List<String> getUsedChars() {
        return usedChars;
    }
}
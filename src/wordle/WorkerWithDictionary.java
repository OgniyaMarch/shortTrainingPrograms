package wordle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class WorkerWithDictionary {
    private Dictionary dictionary;
    private String hiddenWord;
    private List<Character> hiddenWordToChar = new ArrayList<>();
    private List<Character> userWord = new ArrayList<>();
    private Word listOfWords;

    WorkerWithDictionary(){
         dictionary = new Dictionary();
         getHiddenWordFromList();
    }
    private String getHiddenWordFromList(){
        Random random = new Random();
        int index = random.nextInt(dictionary.getWordlist().size());

        listOfWords = dictionary.getWordlist().get(index);
        int wordCount = random.nextInt(listOfWords.getSizeWordlist());

        hiddenWord = listOfWords.getWord(wordCount);

        hiddenWordToChar = toCharWord(hiddenWord);

        return hiddenWord;
    }
    private List toCharWord(String word){
        char[] tempCharArray = word.toCharArray();
        List<Character> tempList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++){
            tempList.add(i, tempCharArray[i]);
        }
        return tempList;
    }

    public boolean checkContainsUserInputWord(String userInputWord){
        char firstLetter = userInputWord.charAt(0);
        int indexFirstLetter = (int)firstLetter - 'a';
        if(dictionary.getWordlist().size() > indexFirstLetter){
            if(dictionary.checkContainsWord(indexFirstLetter, userInputWord)) {
                return true;
            }else return false;
        }
        else{
            System.out.println("Wrong word");
            return false;
        }
    }

    public void checkLetterOnPosition(String userInputWord){
        userWord = toCharWord(userInputWord);
        for(int i = 0; i < userInputWord.length(); i++){
            if (!hiddenWordToChar.get(i).equals(userWord.get(i))){
                userWord.set(i, '_');
            }
        }
        System.out.println("Letters on right position: " + userWord);

    }

    public boolean checkWin(String userInputWord){
        if(userInputWord.equalsIgnoreCase(hiddenWord)){
            return true;
        }
        else return false;
    }
    public String getHiddenWord() {
        return hiddenWord;
    }
}


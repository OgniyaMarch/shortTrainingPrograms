package wordle.usedStream;

import wordle.Dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class WorkerWithDictionary {
    private  Dictionary dictionary;
    private final List<Character> charHiddenWord;
    private List<Character> userWord = new ArrayList<>();
    public WorkerWithDictionary() {
        dictionary = new Dictionary();
        charHiddenWord = returnCharsListFromWord(getHiddenWordFromDictionary());

        System.out.println(charHiddenWord);
    }
    private List returnCharsListFromWord(String word){
        char[] tempCharArray = word.toCharArray();
        List<Character> tempList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++){
            tempList.add(i, tempCharArray[i]);
        }
        return tempList;
    }

    private String getHiddenWordFromDictionary(){
        Random random = new Random();
        int letter = random.nextInt(dictionary.getWordlist().size());

        //generate a number based on the size of the array that is in the ArrayList of words
        int word = random.nextInt(dictionary.getWordlist().get(letter).getSizeWordlist());

        return dictionary.getWordlist().get(letter).getWord(word);
    }

    public boolean checkContainsUserInputInDictionary(String userInput){
        int firstLetter = userInput.charAt(0) - 'a';

        //get full wordList
//        List<String> wordList = dictionary.getWordlist()
//                .stream()
//                .flatMap(words -> words.getWords()
//                        .stream()
//                        ).collect(Collectors.toList());

        List<String> wordlistByFirstLetter = dictionary
                .getWordlist()
                .get(firstLetter)
                .getWords()
                        .stream().toList();

        return wordlistByFirstLetter.contains(userInput);
    }



    public void printResultChecking(String userInput){
        userWord = returnCharsListFromWord(userInput);
        //створюємо список для повністю вірних позицій
        //спочатку вписуємо всі літери які повністю співпали.
        //сторюємо список для не вірних позицій
        //виключаємо їх з переліку символів
        //виписуємо всі літери які не на своїй позиції, але є в переліку символів що залишились
        List<Character> charactersOnRightPosition = new ArrayList<>();
        for (int i = 0; i < userWord.size(); i++){
            if (userWord.get(i).equals(charHiddenWord.get(i))){
                charactersOnRightPosition.add(userWord.get(i));
            } else charactersOnRightPosition.add('-');
        }
        for (int i = userWord.size()-1; i >= 0; i--){
            if (userWord.get(i).equals(charHiddenWord.get(i))){
                userWord.remove(i);
            }
        }
        System.out.println("On right position: " + charactersOnRightPosition);

        List<Character> charactersOnWrongPosition = userWord.stream()
                .filter(character -> charHiddenWord.contains(character))
                .collect(Collectors.toList());


        System.out.println("On wrong position: " + charactersOnWrongPosition);
    }

    public boolean checkWin(String userInput){
        int rightLetters = 0;
        for(int i = 0; i < userInput.length(); i++){
            if(charHiddenWord.get(i).equals(returnCharsListFromWord(userInput).get(i))){
                rightLetters++;
            }
            else return false;
            if (rightLetters == 4){
                return true;
            }
        }
        return false;
    }
    public List getHiddenWord() {
        return charHiddenWord;
    }
}

package hangmanGameEnVersion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListWordsForGame {
    private List<String> vocabulary = new ArrayList<>();
    private List<Character> wordToChar = new ArrayList<>();
    ListWordsForGame(){
        vocabulary.add("bookcase");
        vocabulary.add("cathedral");
        vocabulary.add("curiously");
        vocabulary.add("disappointment");
        vocabulary.add("experience");
        vocabulary.add("friendship");
        vocabulary.add("grandchild");
        vocabulary.add("hardware");
        vocabulary.add("chocolate");
        vocabulary.add("document");
        vocabulary.add("elementary");
        vocabulary.add("foreigner");
        vocabulary.add("headache");
    }

    public List getRandomWord(){
        Random random = new Random();

        String gameWord = vocabulary.get(random.nextInt(vocabulary.size()));


        for(int i = 0; i < gameWord.length(); i++){
            char[] tempChar = gameWord.toCharArray();
            wordToChar.add(tempChar[i]);
        }


        return wordToChar;
    }

}

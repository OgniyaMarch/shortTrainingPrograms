package hangmanGameEnVersion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VocabularyForGame {
    private List<String> vocabulary = new ArrayList<>();
    private List<Character> wordToChar = new ArrayList<>();
    VocabularyForGame(){
        vocabulary.add("bookcase");
        vocabulary.add("cathedral");
        vocabulary.add("curiously");
        vocabulary.add("disappointment");
        vocabulary.add("experience");
        vocabulary.add("friendship");
        vocabulary.add("grandchild");
        vocabulary.add("hardware");
    }

    public List getRandomWord(){
        Random random = new Random();

        String gameWord = vocabulary.get(random.nextInt(8));


        for(int i = 0; i < gameWord.length(); i++){
            char[] tempChar = gameWord.toCharArray();
            wordToChar.add(tempChar[i]);
        }


        return wordToChar;
    }

}

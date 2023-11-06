package wordle;

import java.util.List;

public class Word {
    private List<String> words;

    public  boolean checkContain(String userInputWord){
        return words.contains(userInputWord);
    }
    public int getSizeWordlist() {
        return words.size();
    }

    public Word(List<String> word) {
        this.words = word;
    }

    public String getWord(int index) {
        return words.get(index);
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
}

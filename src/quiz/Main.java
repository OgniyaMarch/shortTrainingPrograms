package quiz;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Questions quiz = new Questions();
        quiz.keepFirstQuestion();
        quiz.keepSecondQuestion();
        System.out.println("Your score: " + quiz.countScore());
    }
}

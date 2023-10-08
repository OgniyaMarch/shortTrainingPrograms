package quiz;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Questions {
    private int score = 0;
    private List<String> rightAnswersQuiz = new ArrayList<>();
    private List<String> userAnswers = new ArrayList<>();


    Questions(){
        rightAnswersQuiz.add("a");
        rightAnswersQuiz.add("d");
        rightAnswersQuiz.add("a");
        rightAnswersQuiz.add("b");

        rightAnswersQuiz.add("c");
        rightAnswersQuiz.add("a");
        rightAnswersQuiz.add("d");
        rightAnswersQuiz.add("c");
    }

    public void keepFirstQuestion() throws FileNotFoundException {
        System.out.println(QuizReader.getQuestion(0));

        System.out.println("1. a) her that \tb) that \tc) that her \td) to her that");
        userAnswers.add(UserAnswerInput.giveABCDanswer());

        System.out.println("2. a) admit \tb) explain \tc) report \td) tell");
        userAnswers.add(UserAnswerInput.giveABCDanswer());

        System.out.println("3. a) that \tb) that to them \tc) them that \td) them to that");
        userAnswers.add(UserAnswerInput.giveABCDanswer());

        System.out.println("4. a) by \tb) for \tc) that \td) to");
        userAnswers.add(UserAnswerInput.giveABCDanswer());
    }

    public void keepSecondQuestion() throws FileNotFoundException{
        System.out.println(QuizReader.getQuestion(1));

        System.out.println("1. a) becoming \tb) being \tc) getting \td) going");
        userAnswers.add(UserAnswerInput.giveABCDanswer());

        System.out.println("2. a) feel \tb) feel as \tc) feel it \td) feel to be");
        userAnswers.add(UserAnswerInput.giveABCDanswer());

        System.out.println("3. a) looked \tb) looked as \tc) looked for \td) looked like");
        userAnswers.add(UserAnswerInput.giveABCDanswer());

        System.out.println("4. a) seemed \tb) seemed like \tc) seemed to be \td) seemed was");
        userAnswers.add(UserAnswerInput.giveABCDanswer());
    }

    public int countScore(){
        for (int i = 0; i < userAnswers.size(); i++){
            if(rightAnswersQuiz.get(i).equalsIgnoreCase(userAnswers.get(i))){
                score++;
            }
        }
        return score;
    }
}

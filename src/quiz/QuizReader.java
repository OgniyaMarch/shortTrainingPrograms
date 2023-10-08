package quiz;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizReader {
    private static List<String> listOfQuestion = new ArrayList<>();
    private static int listLength = listOfQuestion.size();
    private static void readQuiz() throws FileNotFoundException {
        File file = new File("src/quiz/Quiz");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext())
        {
            String[] question = scanner.nextLine().split("\n");
            listOfQuestion.add(question[0]);
        }
    }
    public static String getQuestion(int index) throws FileNotFoundException {
        if(listLength == 0){
            readQuiz();
        }
        return listOfQuestion.get(index);
    }
}

package Projects.QuizApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizService {

    List<Questions> questionsList = new ArrayList<>();
    List<String> userAnswers = new ArrayList<>();;

    public void startQuiz() {
        System.out.println("Quiz Started!");
    }
    
    public void endQuiz() {
        System.out.println("Quiz Ended!");
    }

    public void evaluateAnswers() {
        System.out.println("Evaluating Answers...");
    }
     
    public void setQuestions(){
        questionsList.add(new Questions(1, "What is the capital of France?", new String[]{"A. Paris", "B. London", "C. Berlin", "D. Madrid"}, "A"));
        questionsList.add(new Questions(2, "What is the capital of India?", new String[]{"A. Paris", "B. London", "C. New Delhi", "D. Madrid"}, "C"));
        questionsList.add(new Questions(3, "What is the capital of Canada?", new String[]{"A. Toronto", "B. London", "C. Berlin", "D. Madrid"}, "A"));
        questionsList.add(new Questions(4, "What is the capital of USA?", new String[]{"A. Paris", "B. Wasinton DC", "C. Berlin", "D. Madrid"}, "B"));
        questionsList.add(new Questions(5, "What is the capital of Sri Lanka?", new String[]{"A. Paris", "B. London", "C. Colombo", "D. Madrid"}, "C"));
    }

    public void setUserAnswers(List<Questions> questionsList){
        for (Questions question : questionsList) {
            System.out.println("Question ID: " + question.getQuestionId()+
                               "\nQuestion: " + question.getQuestionText());
            for (String option : question.getOptions()) {
                System.out.println(option);
            }
            System.out.println("Please select your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            userAnswers.add(answer);             
        }
    }

    public void calculateScore(){
        int score = 0;
        for (int i = 0; i < questionsList.size(); i++) {
            if (questionsList.get(i).getCorrectAnswer().equalsIgnoreCase(userAnswers.get(i))) {
                score++;
            }
        }
        System.out.println("Your Score: " + score + " out of " + questionsList.size());
    }

    public void processQuiz(List<Questions> questionsList , List<String> userAnswers) {
        startQuiz();
        setQuestions();
        setUserAnswers(questionsList);
        evaluateAnswers();
        calculateScore();
        endQuiz();
    }
}

package Projects.QuizApp;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Quiz Application!");
        QuizService quizService = new QuizService();
        quizService.processQuiz(quizService.questionsList, quizService.userAnswers);
    }
}

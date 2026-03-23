import java.util.ArrayList;
import java.util.Scanner;

class Questions {
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    int correctAnswer;

    Questions(  String question,
    String option1,
    String option2,
    String option3,
    String option4,
    int correctAnswer){
        this.question =question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3= option3;
        this.option4 = option4;
        this.correctAnswer = correctAnswer;
    }
}

class Quiz{
    ArrayList<Questions> questions = new ArrayList<>();
    int score = 0;


    public void addQuestions() {
        questions.add(new Questions("What is JAVA?", "Programming language", "Human", "Food", "Animal", 1));

        questions.add(new Questions("What does AIR means in terms of  competition?", "Rank", "Wind", "Competeness", "Cloud", 2));
        questions.add(new Questions("What comes after the letter E in keyboard?", "T", "L", "P", "R", 3));
        questions.add(new Questions("Which flower is available in black colour?", "Rose", "Tulip", "Lotus", "Mogra", 4));

    }
    public void startQuiz(){
        Scanner sc = new Scanner(System.in);
        for(Questions q : questions){
        System.out.println("\n" + q.question);
            System.out.println("Question 1 : " + q.option1);
            System.out.println("Question 2 : " + q.option2);
            System.out.println("Question 3 : " + q.option3);
            System.out.println("Question 4 : " + q.option4);
            System.out.println("Enter your correct answer : ");
            int userEnter = sc.nextInt();

            if(userEnter == q.correctAnswer){
                System.out.println("Yeaahh , you guessed it right");
                score++;
            }else{
                System.out.println("No you entered wrong answer");
            }
    }
}

public void showResult() {
    System.out.println("\nYour Score : " + score + "/" + questions.size());
}
}

public class QuizApplication {
    public static void main(String args[]){
        Quiz qz = new Quiz();
        qz.addQuestions();
        qz.startQuiz();
        qz.showResult();
    }
}

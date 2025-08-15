package Task8;

import java.util.*;

class Question {
    String questionText;
    String[] options;
    char correctOption;

    Question(String questionText, String[] options, char correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = Character.toUpperCase(correctOption);
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Adding questions
        questions.add(new Question(
                "1. What are Java loops?",
                new String[]{"A. Conditional statements", "B. Repetitive execution blocks", "C. Exception handlers", "D. Data types"},
                'B'
        ));

        questions.add(new Question(
                "2. What is enhanced for-loop?",
                new String[]{"A. Loop for numbers only", "B. For-each loop for collections/arrays", "C. Loop with conditions", "D. Loop inside another loop"},
                'B'
        ));

        questions.add(new Question(
                "3. How do you handle multiple user inputs?",
                new String[]{"A. Using multiple Scanners", "B. Using arrays or collections", "C. Using switch only", "D. Using try-catch"},
                'B'
        ));

        questions.add(new Question(
                "4. How is a switch-case different from if-else?",
                new String[]{"A. Switch supports multiple cases directly", "B. If-else is faster", "C. Switch can only compare numbers", "D. No difference"},
                'A'
        ));

        questions.add(new Question(
                "5. What are collections in Java?",
                new String[]{"A. Group of primitive data types", "B. Framework for storing/manipulating objects", "C. Java packages", "D. Class variables"},
                'B'
        ));

        questions.add(new Question(
                "6. What is ArrayList?",
                new String[]{"A. Fixed-size array", "B. Dynamic array in Java", "C. 2D array", "D. String array"},
                'B'
        ));

        questions.add(new Question(
                "7. How to iterate using iterators?",
                new String[]{"A. iterator().next()", "B. iterator().hasNext() in loop", "C. for-each only", "D. while(true)"},
                'B'
        ));

        questions.add(new Question(
                "8. What is a Map?",
                new String[]{"A. Stores elements in key-value pairs", "B. Stores only keys", "C. Stores only values", "D. Stores both keys and values separately"},
                'A'
        ));

        questions.add(new Question(
                "9. How to sort a list?",
                new String[]{"A. Collections.sort(list)", "B. list.sort()", "C. Arrays.sort()", "D. All of the above"},
                'D'
        ));

        questions.add(new Question(
                "10. How to shuffle elements?",
                new String[]{"A. Collections.shuffle(list)", "B. Random.shuffle()", "C. Arrays.shuffle()", "D. list.shuffle()"},
                'A'
        ));

        int score = 0;

        System.out.println("===== Welcome to the Java Quiz =====");
        for (Question q : questions) {
            System.out.println(q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }
            System.out.print("Your answer (A/B/C/D): ");
            char answer = Character.toUpperCase(scanner.next().charAt(0));

            if (answer == q.correctOption) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.correctOption + "\n");
            }
        }

        System.out.println("===== Quiz Finished =====");
        System.out.println("Your Score: " + score + "/" + questions.size());

        scanner.close();
    }
}

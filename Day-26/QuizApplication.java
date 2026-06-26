import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        int answer, score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Q1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Chennai");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 2) {
            score++;
        }
        System.out.println("\nQ2. Which language is used for Java programming?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 1) {
            score++;
        }
        System.out.println("\nQ3. 5 + 3 = ?");
        System.out.println("1. 6");
        System.out.println("2. 7");
        System.out.println("3. 8");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 3) {
            score++;
        }
        System.out.println("\nYour Score = " + score + "/3");
        sc.close();
    }
}
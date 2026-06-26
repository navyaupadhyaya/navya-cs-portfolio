import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int secretNumber = 50;
        int guess;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess > secretNumber)
                System.out.println("Too high!");
            else if (guess < secretNumber)
                System.out.println("Too low!");
            else
                System.out.println("Correct!");
        } while (guess != secretNumber);
        sc.close();
    }
}
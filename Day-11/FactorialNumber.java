import java.util.Scanner;

public class FactorialNumber {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        num = sc.nextInt();
        result = factorial(num);
        System.out.println("Factorial is: " + result);
        sc.close();
    }
}

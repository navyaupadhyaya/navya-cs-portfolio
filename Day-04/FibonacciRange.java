import java.util.Scanner;

public class FibonacciRange {
    public static void main(String[] args) {
        int first = 0, second = 1, next, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        if (n == 0) {
            System.out.println("Nth Fibonacci term: 0");
        } else if (n == 1) {
            System.out.println("Nth Fibonacci term: 1");
        } else {
            for (int i = 2; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.println("Nth Fibonacci term: " + second);
        }

        sc.close();
    }
}
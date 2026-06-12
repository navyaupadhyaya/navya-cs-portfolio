import java.util.Scanner;

public class FibonacciNumber {
    static void printFibonacci(int n) {
        int a = 0, b = 1, c, i;
        System.out.print("Fibonacci Series: ");
        for (i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms:");
        n = sc.nextInt();
        printFibonacci(n);
        sc.close();
    }
}

import java.util.Scanner;

public class RecursiveFibonacci {
    static int fib(int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return (fib(n - 1) + fib(n - 2));
    }

    public static void main(String[] args) {
        int term, i, f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        term = sc.nextInt();
        for (i = 1; i <= term; i++) {
            f = fib(i);
            System.out.print(f + "   ");
            sc.close();
        }
    }
}
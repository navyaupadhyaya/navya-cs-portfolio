import java.util.Scanner;

public class RecursiveSumOfDigits {
    static int Sum(int n) {
        if (n <= 9)
            return n;
        else
            return (n % 10) + Sum(n / 10);
    }

    public static void main(String[] args) {
        int nn, s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        nn = sc.nextInt();
        s = Sum(nn);
        System.out.println("Sum of digits" + s);
        sc.close();
    }
}

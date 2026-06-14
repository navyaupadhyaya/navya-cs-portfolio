import java.util.Scanner;

public class RecursiveFactorial {
    static int Fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * Fact(n - 1);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        num = sc.nextInt();
        int f = Fact(num);
        System.out.println("Factorial is " + f);
        sc.close();
    }
}

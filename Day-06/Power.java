import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int a, n, result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        a = sc.nextInt();
        System.out.print("Enter exponent: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            result = result * a;
        }
        System.out.println("Result = " + result);
        sc.close();
    }
}

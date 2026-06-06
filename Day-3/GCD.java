import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int a, b, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD = " + a);
        sc.close();
    }
}
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int n1 = a, n2 = b, temp, gcd, lcm;
        while (n2 != 0) {
            temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        gcd = n1;
        lcm = (a * b) / gcd;
        System.out.println("LCM = " + lcm);
        sc.close();
    }
}
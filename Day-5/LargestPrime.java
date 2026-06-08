import java.util.Scanner;

public class LargestPrime {
    public static void main(String[] args) {
        long n, factor = 2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        n = sc.nextInt();
        while (n > 1) {
            if (n % factor == 0) {
                n = n / factor;
            } else {
                factor++;
            }
        }
        System.out.println(factor);
        sc.close();
    }
}
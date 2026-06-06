import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

        sc.close();
    }
}
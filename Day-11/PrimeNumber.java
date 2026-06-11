import java.util.Scanner;

public class PrimeNumber {

    static int checkPrime(int n) {
        int count = 0, i;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        num = sc.nextInt();
        if (checkPrime(num) == 2)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
        sc.close();
    }
}

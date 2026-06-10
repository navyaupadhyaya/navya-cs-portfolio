import java.util.Scanner;

public class RecursiveReverse {
    static int rev = 0;

    static int reverse(int n) {
        if (n == 0)
            return rev;
        else {
            rev = rev * 10 + (n % 10);
            return reverse(n / 10);
        }
    }

    public static void main(String[] args) {
        int num, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        num = sc.nextInt();
        r = reverse(num);
        System.out.println("Reversed number = " + r);
        sc.close();
    }
}

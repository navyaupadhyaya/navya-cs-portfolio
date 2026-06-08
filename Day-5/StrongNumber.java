import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        int num, n1, sum = 0, digit, fact = 1, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        num = sc.nextInt();
        n1 = num;
        while (num > 1) {
            digit = num % 10;
            for (i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (sum == n1) {
            System.out.println("Strong number is" + n1);
        } else {
            System.out.println("Not a Strong number");
            sc.close();
        }
    }
}

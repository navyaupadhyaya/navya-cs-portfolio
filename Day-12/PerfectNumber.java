import java.util.Scanner;

public class PerfectNumber {
    static void checkPerfect(int num) {
        int sum = 0, i;
        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = sc.nextInt();
        checkPerfect(num);
        sc.close();
    }
}

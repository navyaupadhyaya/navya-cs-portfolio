import java.util.Scanner;

public class ArmstrongNumber {
    static void checkArmstrong(int num) {
        int sum = 0, temp = num, digit;
        while (temp > 0) {
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }
        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        n = sc.nextInt();
        checkArmstrong(n);
        sc.close();
    }
}

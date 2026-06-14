import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        int num, n1, temp, sum = 0, d1, d2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of range: ");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (num = start; num <= end; num++) {
            n1 = num;
            temp = num;
            d1 = String.valueOf(num).length();
            while (temp > 0) {
                d2 = temp % 10;
                sum += Math.pow(d2, d1);
                temp /= 10;
            }
            if (sum == n1) {
                System.out.print(n1 + " ");
            }
        }
        sc.close();
    }
}
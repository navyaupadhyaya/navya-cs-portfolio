import java.util.Scanner;

public class MaximumNumber {
    static int findMax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int n1, n2, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        n1 = sc.nextInt();
        System.out.print("Enter second number:");
        n2 = sc.nextInt();
        max = findMax(n1, n2);
        System.out.println("Maximum number is:" + max);
        sc.close();
    }
}

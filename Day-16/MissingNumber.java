import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        int n, i, sum = 0, expectedSum, missing;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        n = sc.nextInt();
        int arr[] = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " numbers:");
        for (i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        expectedSum = n * (n + 1) / 2;
        missing = expectedSum - sum;
        System.out.println("Missing number is: " + missing);
        sc.close();
    }
}

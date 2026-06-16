import java.util.Scanner;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int n, i, j, sum;
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the required sum: ");
        sum = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found: " + arr[i] + " and " + arr[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pair found.");
        }
        sc.close();
    }
}
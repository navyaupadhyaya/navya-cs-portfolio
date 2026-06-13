import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n, i, evenCount = 0, oddCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of Even Elements = " + evenCount);
        System.out.println("Number of Odd Elements = " + oddCount);
        sc.close();
    }
}

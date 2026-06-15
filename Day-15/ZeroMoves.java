import java.util.Scanner;

public class ZeroMoves {
    public static void main(String[] args) {
        int n, i, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while (j < n) {
            arr[j] = 0;
            j++;
        }
        System.out.println("Array after moving zeroes to end:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

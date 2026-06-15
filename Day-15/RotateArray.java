import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int n, i, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        temp = arr[0];
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        System.out.println("Array after left rotation:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
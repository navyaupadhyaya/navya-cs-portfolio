import java.util.Scanner;

public class ReverseArray {
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
        for (i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("Reversed array:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

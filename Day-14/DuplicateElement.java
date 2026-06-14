import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        int n, i, j, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate elements are:");
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println("No duplicate elements found.");
        }
        sc.close();
    }
}

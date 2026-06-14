import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int n, key, i, position = -1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        key = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            position = position + 1;
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}

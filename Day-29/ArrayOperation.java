import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        int n, i, choice, key, max, min, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Display Array");
            System.out.println("2. Search Element");
            System.out.println("3. Find Maximum");
            System.out.println("4. Find Minimum");
            System.out.println("5. Find Sum");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Array Elements:");
                    for (i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter element to search: ");
                    key = sc.nextInt();
                    boolean found = false;
                    for (i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at position " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;
                case 3:
                    max = arr[0];
                    for (i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Maximum element = " + max);
                    break;
                case 4:
                    min = arr[0];
                    for (i = 1; i < n; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Minimum element = " + min);
                    break;
                case 5:
                    sum = 0;
                    for (i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum of array elements = " + sum);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
}
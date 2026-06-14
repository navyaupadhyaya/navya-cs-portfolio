import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int n, i, largest, secondLargest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largest = arr[0];
        secondLargest = arr[0];
        for (i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element = " + secondLargest);
        sc.close();
    }
}

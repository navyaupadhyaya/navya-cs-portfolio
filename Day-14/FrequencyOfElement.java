import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int n, key, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to find frequency: ");
        key = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("Frequency of " + key + " = " + count);
        sc.close();
    }
}

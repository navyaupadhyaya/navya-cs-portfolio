import java.util.Scanner;

public class MaxFrequencyElement {
    public static void main(String[] args) {
        int n, i, j, maxFreq = 0, freq = 1;
        int element = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            if (freq > maxFreq) {
                maxFreq = freq;
                element = arr[i];
            }
        }
        System.out.println("Maximum frequency element: " + element);
        System.out.println("Frequency: " + maxFreq);
        sc.close();
    }
}

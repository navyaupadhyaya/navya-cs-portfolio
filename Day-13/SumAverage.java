import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, i;
        double avg;
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = (double) sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        sc.close();
    }
}

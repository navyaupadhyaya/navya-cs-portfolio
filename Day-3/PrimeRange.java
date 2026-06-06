import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        int start, end, i, j, count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        start = sc.nextInt();
        System.out.print("Enter end: ");
        end = sc.nextInt();
        for (i = start; i <= end; i++) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {

                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
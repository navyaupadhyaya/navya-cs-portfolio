import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] args) {
        int i, j, rows, n, k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        rows = sc.nextInt();
        n = rows + (rows - 1);
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= n; k++) {
                System.out.print("*");
            }
            n = n - 2;
            System.out.println();
        }
        sc.close();
    }
}

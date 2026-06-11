import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        int i, j, k, rows, n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = i; j <= rows; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= n; k++) {
                System.out.print("*");
            }
            n = n + 2;
            System.out.println();
        }
        sc.close();
    }
}

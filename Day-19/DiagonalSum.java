import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        int n, i, j, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            sum = sum + matrix[i][i];
        }
        System.out.println("Sum of diagonal elements: " + sum);
        sc.close();
    }
}

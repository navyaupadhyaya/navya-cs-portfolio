import java.util.Scanner;

public class ColumnWiseSum {
    public static void main(String[] args) {
        int rows, cols, i, j, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Column-wise Sum:");
        for (j = 0; j < cols; j++) {
            sum = 0;
            for (i = 0; i < rows; i++) {
                sum += a[i][j];
            }
            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }
        sc.close();
    }
}

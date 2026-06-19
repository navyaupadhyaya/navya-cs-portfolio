import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        int r, c, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int[][] transpose = new int[c][r];
        System.out.println("Enter matrix elements:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of matrix:");
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
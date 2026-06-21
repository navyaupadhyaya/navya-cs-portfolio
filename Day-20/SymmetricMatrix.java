import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int n, i, j;
        boolean symmetric = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of square matrix: ");
        n = sc.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        if (symmetric) {
            System.out.println("The matrix is Symmetric.");
        } else {
            System.out.println("The matrix is Not Symmetric.");
        }
        sc.close();
    }
}
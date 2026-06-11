import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        int i, j, k, rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}
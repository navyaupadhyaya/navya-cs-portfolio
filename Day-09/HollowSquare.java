import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

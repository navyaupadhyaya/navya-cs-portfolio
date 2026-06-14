import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            sc.close();
        }

    }

}

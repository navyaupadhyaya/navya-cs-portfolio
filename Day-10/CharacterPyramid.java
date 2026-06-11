import java.util.Scanner;

public class CharacterPyramid {
    public static void main(String[] args) {
        int i, j, k, rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (k = 1; k <= i; k++) {
                System.out.print(ch);
                ch++;
            }
            ch--;
            for (k = 1; k < i; k++) {
                ch--;
                System.out.print(ch);
            }
            System.out.println();
            sc.close();
        }
    }
}

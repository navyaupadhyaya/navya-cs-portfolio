import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        int n, i, j;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (names[i].compareToIgnoreCase(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("\nNames in Alphabetical Order:");
        for (i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
        sc.close();
    }
}

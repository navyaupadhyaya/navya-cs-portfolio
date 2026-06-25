import java.util.Scanner;

public class SortWordsByLength {
    public static void main(String[] args) {
        int n, i, j;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (words[i].length() > words[j].length()) {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("\nWords sorted by length:");
        for (i = 0; i < n; i++) {
            System.out.println(words[i]);
        }
        sc.close();
    }
}
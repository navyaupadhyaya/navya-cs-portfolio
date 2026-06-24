import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (i = 0; i < str.length(); i++) {
            for (j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j))
                    break;
            }
            if (i == j)
                System.out.print(str.charAt(i));
        }
        sc.close();
    }
}

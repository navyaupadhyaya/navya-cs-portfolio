import java.util.Scanner;

public class CommonCharacters {
    public static void main(String[] args) {
        String str1, str2;
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        str2 = sc.nextLine();
        System.out.print("Common characters: ");
        for (i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            for (j = 0; j < str2.length(); j++) {
                char ch2 = str2.charAt(j);
                if (ch1 == ch2) {
                    System.out.print(ch1 + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}
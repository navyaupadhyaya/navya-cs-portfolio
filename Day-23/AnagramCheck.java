import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
        } else {
            int count = 0;
            for (i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);

                if (str2.indexOf(ch) != -1) {
                    count++;
                }
            }
            if (count == str1.length()) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }
        sc.close();
    }
}
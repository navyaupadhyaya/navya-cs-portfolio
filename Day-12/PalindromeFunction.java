import java.util.Scanner;

public class PalindromeFunction {
    public static void main(String[] args) {
        int i, len;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.next();
        String rev = "";
        len = str.length();
        for (i = len - 1; i > 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Palindrome number");
        }
        sc.close();
    }
}

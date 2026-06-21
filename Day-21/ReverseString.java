import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String str, rev = "";
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        for (i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String = " + rev);
        sc.close();
    }
}

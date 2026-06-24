import java.util.Scanner;

public class RotationString {
    public static void main(String[] args) {
        int len1, len2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        len1 = str1.length();
        len2 = str2.length();
        if (len1 == len2 && (str1 + str1).contains(str2)) {
            System.out.println("String is a rotation.");
        } else {
            System.out.println("String is not a rotation.");
        }
        sc.close();
    }
}
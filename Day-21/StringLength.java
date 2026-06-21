import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        String str;
        int count = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        char[] ch = str.toCharArray();
        for (i = 0; i < ch.length; i++) {
            count++;
        }
        System.out.println("Length of the string = " + count);
        sc.close();
    }
}

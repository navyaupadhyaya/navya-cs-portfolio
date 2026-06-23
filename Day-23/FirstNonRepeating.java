import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int i, j, count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (i = 0; i < str.length(); i++) {
            count = 0;
            for (j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                break;
            }
        }
        if (i == str.length()) {
            System.out.println("No non-repeating character found.");
        }
        sc.close();
    }
}
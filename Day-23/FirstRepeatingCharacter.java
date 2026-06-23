import java.util.Scanner;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean found = false;
        for (i = 0; i < str.length(); i++) {
            for (j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("First repeating character: " + str.charAt(i));
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("No repeating character found.");
        }
        sc.close();
    }
}

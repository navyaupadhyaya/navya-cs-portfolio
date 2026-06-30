import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        int choice, i;
        String str1, str2, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        str1 = sc.nextLine();
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Compare with Another String");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Length = " + str1.length());
                    break;
                case 2:
                    System.out.println("Uppercase: " + str1.toUpperCase());
                    break;
                case 3:
                    System.out.println("Lowercase: " + str1.toLowerCase());
                    break;
                case 4:
                    reverse = "";
                    for (i = str1.length() - 1; i >= 0; i--) {
                        reverse += str1.charAt(i);
                    }
                    System.out.println("Reversed String: " + reverse);
                    break;
                case 5:
                    System.out.print("Enter second string: ");
                    str2 = sc.nextLine();

                    if (str1.equals(str2)) {
                        System.out.println("Both strings are equal.");
                    } else {
                        System.out.println("Strings are not equal.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
}
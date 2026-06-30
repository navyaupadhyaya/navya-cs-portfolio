import java.util.Scanner;

public class MiniLibrary {
    public static void main(String[] args) {

        int i;
        Scanner sc = new Scanner(System.in);
        String[] books = { "Java Programming", "Python Basics", "C Programming", "Data Structures",
                "Operating System" };
        boolean[] issued = new boolean[5];
        while (true) {
            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Books:");
                    for (i = 0; i < books.length; i++) {
                        if (!issued[i])
                            System.out.println((i + 1) + ". " + books[i]);
                    }
                    break;
                case 2:
                    System.out.print("Enter book number to issue: ");
                    int issue = sc.nextInt();
                    if (issue >= 1 && issue <= books.length) {
                        if (!issued[issue - 1]) {
                            issued[issue - 1] = true;
                            System.out.println("Book issued successfully.");
                        } else {
                            System.out.println("Book is already issued.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter book number to return: ");
                    int ret = sc.nextInt();
                    if (ret >= 1 && ret <= books.length) {
                        if (issued[ret - 1]) {
                            issued[ret - 1] = false;
                            System.out.println("Book returned successfully.");
                        } else {
                            System.out.println("Book was not issued.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
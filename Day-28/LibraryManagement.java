import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        int bookId, choice, quantity;
        String bookName;
        String author;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Library Management System ");
        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();
        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
        System.out.print("Enter Quantity of Books: ");
        quantity = sc.nextInt();
        System.out.println("\n1. Display Book Details");
        System.out.println("2. Issue Book");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\n--- Book Details ---");
                System.out.println("Book ID     : " + bookId);
                System.out.println("Book Name   : " + bookName);
                System.out.println("Author      : " + author);
                System.out.println("Quantity    : " + quantity);
                break;
            case 2:
                if (quantity > 0) {
                    quantity--;
                    System.out.println("Book issued successfully!");
                    System.out.println("Remaining Books: " + quantity);
                } else {
                    System.out.println("Book not available!");
                }
                break;
            case 3:
                System.out.println("Exiting Program...");
                break;

            default:
                System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}
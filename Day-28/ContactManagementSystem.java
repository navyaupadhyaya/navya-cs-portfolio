import java.util.Scanner;

public class ContactManagementSystem {
    public static void main(String[] args) {
        int contactId, phoneNumber, choice;
        String name;
        String email;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Contact Management System ");
        System.out.print("Enter Contact ID: ");
        contactId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        phoneNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Email: ");
        email = sc.nextLine();
        System.out.println("\n1. Display Contact");
        System.out.println("2. Update Contact");
        System.out.println("3. Delete Contact");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\n--- Contact Details ---");
                System.out.println("Contact ID : " + contactId);
                System.out.println("Name       : " + name);
                System.out.println("Phone No   : " + phoneNumber);
                System.out.println("Email      : " + email);
                break;
            case 2:
                System.out.print("Enter New Phone Number: ");
                phoneNumber = sc.nextInt();
                System.out.println("Contact Updated Successfully!");
                System.out.println("New Phone No: " + phoneNumber);
                break;
            case 3:
                System.out.println("Contact Deleted Successfully!");
                break;
            case 4:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}

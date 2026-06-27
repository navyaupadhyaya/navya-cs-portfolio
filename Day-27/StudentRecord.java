import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        int rollNo, marks, choice;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Student Record Management System");
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
        System.out.println("\nChoose an option:");
        System.out.println("1. Display Student Record");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\n Student Record");
                System.out.println("Roll Number : " + rollNo);
                System.out.println("Name        : " + name);
                System.out.println("Marks       : " + marks);
                break;
            case 2:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}
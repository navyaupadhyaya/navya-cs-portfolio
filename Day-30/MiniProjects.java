import java.util.Scanner;

public class MiniProjects {

    static int[] roll = new int[10];
    static String[] name = new String[10];
    static int[] marks = new int[10];
    static int count = 0;

    static void addStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();
        count++;
        System.out.println("Student record added successfully.");
    }

    static void displayStudents() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\nRoll No\tName\tMarks");
        for (int i = 0; i < count; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (count < 10)
                        addStudent(sc);
                    else
                        System.out.println("Student record is full.");
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
        sc.close();
    }
}
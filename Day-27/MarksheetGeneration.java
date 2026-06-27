import java.util.Scanner;

public class MarksheetGeneration {
    public static void main(String[] args) {
        int rollNo, marks1, marks2, marks3, total, choice;
        double percentage;
        String studentName;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Marksheet Generation System ");
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Marks of Subject 1: ");
        marks1 = sc.nextInt();
        System.out.print("Enter Marks of Subject 2: ");
        marks2 = sc.nextInt();
        System.out.print("Enter Marks of Subject 3: ");
        marks3 = sc.nextInt();
        total = marks1 + marks2 + marks3;
        percentage = total / 3.0;
        System.out.println("\n1. Generate Marksheet");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\n Student Marksheet");
                System.out.println("Roll Number : " + rollNo);
                System.out.println("Name        : " + studentName);
                System.out.println("Subject 1   : " + marks1);
                System.out.println("Subject 2   : " + marks2);
                System.out.println("Subject 3   : " + marks3);
                System.out.println("Total Marks : " + total);
                System.out.println("Percentage  : " + percentage + "%");
                if (percentage >= 40) {
                    System.out.println("Result      : Pass");
                } else {
                    System.out.println("Result      : Fail");
                }
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

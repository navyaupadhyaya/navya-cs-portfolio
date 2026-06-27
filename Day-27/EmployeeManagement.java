import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        int empId, salary, choice;
        String empName;
        String department;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Employee Management System ");
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
        System.out.println("\n1. Display Employee Record");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\n--- Employee Record ---");
                System.out.println("Employee ID : " + empId);
                System.out.println("Name        : " + empName);
                System.out.println("Department  : " + department);
                System.out.println("Salary      : " + salary);
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
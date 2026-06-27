import java.util.Scanner;

public class SalaryManagement {
    public static void main(String[] args) {
        int empId, basicSalary, bonus, totalSalary, choice;
        String empName;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Salary Management System ");
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextInt();
        System.out.print("Enter Bonus: ");
        bonus = sc.nextInt();
        totalSalary = basicSalary + bonus;
        System.out.println("\n1. Display Salary Details");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\n--- Salary Details ---");
                System.out.println("Employee ID   : " + empId);
                System.out.println("Employee Name : " + empName);
                System.out.println("Basic Salary  : " + basicSalary);
                System.out.println("Bonus         : " + bonus);
                System.out.println("Total Salary  : " + totalSalary);
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
import java.util.Scanner;

public class EmployeeManagements {
    public static void main(String[] args) {

        int n, i, choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        n = sc.nextInt();
        int[] empId = new int[n];
        String[] empName = new String[n];
        double[] salary = new double[n];
        while (true) {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (i = 0; i < n; i++) {
                        System.out.println("\nEnter details of Employee " + (i + 1));
                        System.out.print("Enter Employee ID: ");
                        empId[i] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Employee Name: ");
                        empName[i] = sc.nextLine();
                        System.out.print("Enter Salary: ");
                        salary[i] = sc.nextDouble();
                    }
                    break;
                case 2:
                    System.out.println("\n----- Employee Records -----");
                    System.out.println("ID\tName\t\tSalary");
                    for (i = 0; i < n; i++) {
                        System.out.println(empId[i] + "\t" + empName[i] + "\t\t" + salary[i]);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
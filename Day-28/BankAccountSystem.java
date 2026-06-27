import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[] args) {
        int accountNo, choice, amount;
        String accountHolder;
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Bank Account System ");
        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();
        System.out.print("Enter Initial Deposit Amount: ");
        balance = sc.nextInt();
        System.out.println("\n1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Display Account Details");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter Deposit Amount: ");
                amount = sc.nextInt();
                balance = balance + amount;
                System.out.println("Money Deposited Successfully!");
                System.out.println("Balance: " + balance);
                break;
            case 2:
                System.out.print("Enter Withdraw Amount: ");
                amount = sc.nextInt();
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Money Withdrawn Successfully!");
                    System.out.println("Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }
                break;
            case 3:
                System.out.println("\n--- Account Details ---");
                System.out.println("Account Number : " + accountNo);
                System.out.println("Account Holder : " + accountHolder);
                System.out.println("Balance        : " + balance);
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
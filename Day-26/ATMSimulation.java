import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        int choice, amount;
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("ATM MENU");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Your Balance = " + balance);
        } else if (choice == 2) {
            System.out.print("Enter deposit amount: ");
            amount = sc.nextInt();
            balance = balance + amount;
            System.out.println("Updated Balance = " + balance);
        } else if (choice == 3) {
            System.out.print("Enter withdrawal amount: ");
            amount = sc.nextInt();
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Please collect your cash.");
                System.out.println("Remaining Balance = " + balance);
            } else {
                System.out.println("Insufficient Balance.");
            }
        } else {
            System.out.println("Invalid Choice.");
        }
        sc.close();
    }
}
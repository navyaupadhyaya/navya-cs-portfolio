import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args) {
        int choice, n = 0, i;
        int[] id = new int[10];
        int[] quantity = new int[10];
        String[] name = new String[10];
        int searchId;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n----- Inventory Management System -----");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (n < 10) {
                        System.out.print("Enter Product ID: ");
                        id[n] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Product Name: ");
                        name[n] = sc.nextLine();
                        System.out.print("Enter Quantity: ");
                        quantity[n] = sc.nextInt();
                        n++;
                        System.out.println("Product added successfully.");
                    } else {
                        System.out.println("Inventory is full.");
                    }
                    break;
                case 2:
                    if (n == 0) {
                        System.out.println("No products available.");
                    } else {
                        System.out.println("\nID\tName\tQuantity");
                        for (i = 0; i < n; i++) {
                            System.out.println(id[i] + "\t" + name[i] + "\t" + quantity[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID to search: ");
                    searchId = sc.nextInt();
                    boolean found = false;
                    for (i = 0; i < n; i++) {
                        if (id[i] == searchId) {
                            System.out.println("Product Found:");
                            System.out.println("ID: " + id[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        sc.close();
    }
}
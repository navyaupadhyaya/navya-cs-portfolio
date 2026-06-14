import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        int binary, decimal = 0, base = 1, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        binary = sc.nextInt();
        while (binary > 0) {
            rem = binary % 10;
            decimal = decimal + rem * base;
            base = base * 2;
            binary = binary / 10;
        }
        System.out.println("Decimal = " + decimal);
        sc.close();
    }
}

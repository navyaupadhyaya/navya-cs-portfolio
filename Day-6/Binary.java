import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int num;
        String binary = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number");
        num = sc.nextInt();
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        System.out.println("Binary=" + binary);
        sc.close();
    }
}
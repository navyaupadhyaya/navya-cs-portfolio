import java.util.Scanner;

public class CountSet {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }
        System.out.println("Number of set bits = " + count);
        sc.close();
    }
}
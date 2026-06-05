import java.util.Scanner;

public class Reverse {
    public static void main() {
        int n, r;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n > 0)

        {
            r = n % 10;
            n = n / 10;
            System.out.print("Reverse Order" + r);
            sc.close();
        }
    }
}

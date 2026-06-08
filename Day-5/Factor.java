import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        n = sc.nextInt();
        System.out.println("Factor of " + n + "are:");
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sc.close();
            }
        }
    }
}

import java.util.Scanner;

public class SumNumber {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int n1, n2, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        n1 = sc.nextInt();
        System.out.print("Enter second number:");
        n2 = sc.nextInt();
        result = add(n1, n2);
        System.out.println("Sum is:" + result);
        sc.close();
    }
}

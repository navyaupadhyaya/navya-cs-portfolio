import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        int num, sum = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        num = sc.nextInt();
        for (i = 1; i < num; i++)
            if (num % i == 0) {
                sum = sum + i;
            }
        if (sum == num) {
            System.out.println("Perfect number is" + num);
        } else {
            System.out.println("Not a Perfect number");
            sc.close();
        }
    }
}

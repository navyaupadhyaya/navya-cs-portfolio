import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result = result + str.charAt(i) + count;
                count = 1;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
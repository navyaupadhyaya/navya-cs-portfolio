import java.util.Scanner;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        int i, j, count, maxCount = 0;
        char maxChar = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (i = 0; i < str.length(); i++) {
            count = 0;
            for (j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }
        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
        sc.close();
    }
}
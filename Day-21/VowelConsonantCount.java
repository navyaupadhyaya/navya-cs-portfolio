import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str;
        int vowels = 0, consonants = 0, i;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        for (i = 0; i < str.length(); i++) {
            ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Number of Vowels = " + vowels);
        System.out.println("Number of Consonants = " + consonants);
        sc.close();
    }
}

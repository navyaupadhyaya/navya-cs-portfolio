import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {

        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        n = sc.nextInt();
        int[] roll = new int[n];
        String[] name = new String[n];
        int[] marks = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            System.out.print("Enter Roll Number: ");
            roll[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }
        System.out.println("\n----- Student Records -----");
        System.out.println("Roll No\tName\t\tMarks");
        for (i = 0; i < n; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t\t" + marks[i]);
        }
        sc.close();
    }
}
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        int n1, n2, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Common Elements:");
        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}

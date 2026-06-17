import java.util.Scanner;

public class UnionArrays {
    public static void main(String[] args) {
        int n1, n2, i, j, k = 0, flag = 0;
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
        int[] union = new int[n1 + n2];
        for (i = 0; i < n1; i++) {
            union[k++] = arr1[i];
        }
        for (i = 0; i < n2; i++) {
            for (j = 0; j < k; j++) {
                if (arr2[i] == union[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                union[k++] = arr2[i];
            }
        }
        System.out.println("Union of Arrays:");
        for (i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
        sc.close();
    }
}

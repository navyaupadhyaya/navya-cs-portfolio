import java.util.Scanner;

public class IntersectionArrays {
    public static void main(String[] args) {
        int n1, n2, i, j, k, flag;
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
        int[] intersection = new int[Math.min(n1, n2)];
        k = 0;
        for (i = 0; i < n1; i++) {
            flag = 0;
            for (j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                intersection[k++] = arr1[i];
            }
        }
        System.out.println("Intersection of Arrays:");
        for (i = 0; i < k; i++) {
            System.out.print(intersection[i] + " ");
        }
        sc.close();
    }
}

import java.util.*;

public class ProductExceptSelf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Product(arr, n);
    }

    public static void Product(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            long p = 1;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    p *= arr[j];
                }
            }
            System.out.print(p + " ");
        }

    }
}
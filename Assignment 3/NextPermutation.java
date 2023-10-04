import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            Permutation(arr, n);
        }

    }

    public static void Permutation(int[] arr, int n) {
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                    while (count == 0) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        count++;
                    }
                }

            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

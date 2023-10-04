import java.util.*;

public class RunningSumoftheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }

        Sum(arr, n);
    }

    public static void Sum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            System.out.print(sum + " ");
        }
    }
}
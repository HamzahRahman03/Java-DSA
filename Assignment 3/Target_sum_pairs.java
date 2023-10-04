import java.util.*;

public class Target_sum_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Target_sum(arr, n, target);
    }

    public static void Target_sum(int[] arr, int n, int target) {
        for (int i = 0; i < n-1; i++) {
            if (arr[i] <= target) {
                for (int j = i+1; j < n; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println(Math.min(arr[i], arr[j]) + " and " + Math.max(arr[i], arr[j]));
                    }
                }
            }
        }
    }
}

import java.util.*;

public class MaximumSumPathInTwoArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        int i = 0;
        while (i < t) {
            int n = s.nextInt();
            int m = s.nextInt();

            int[] a1 = new int[n];
            int[] a2 = new int[m];

            for (int j = 0; j < n; j++) {
                a1[j] = s.nextInt();
            }

            for (int k = 0; k < m; k++) {
                a2[k] = s.nextInt();
            }

            Sum(a1, a2, n, m);
        }
    }

    public static void Sum(int[] a1, int[] a2, int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        int ans = 0;
        int min = 0;

        for (int i = 0; i < n; i++) {
            sum1 += a1[i];

            for (int j = min; j < m; j++) {
                sum2 += a2[j];

                if (a1[i] == a2[j]) {
                    ans += Math.max(sum1, sum2);
                    sum1 = 0;
                    sum2 = 0;
                    min = j + 1;
                }

            }
                if (i == n - 1) {
                    ans += Math.max(sum1, sum2);
                }

            sum2 = 0;
        }

        System.out.println(ans);
    }
}
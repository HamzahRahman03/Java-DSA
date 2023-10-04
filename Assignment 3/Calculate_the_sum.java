import java.util.*;

public class Calculate_the_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        int m = sc.nextInt();
        int j = 0;
        while (j < m) {
            int a = sc.nextInt();
            arr = Sum(arr, n, a);
            j++;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int x = (int) (Math.pow(10, 9)) + 7;
        System.out.println(sum % x);

    }

    public static long[] Sum(long[] arr, int n, int a) {
        int sum = 0;
        long[] temp = new long[n];
        for (int i = 0; i < n; i++) {
            if (i - a < 0) {
                temp[i] = arr[i] + arr[n - a + i];
            }

            else {
                temp[i] = arr[i] + arr[i - a];
            }

        }

        return temp;
    }

}

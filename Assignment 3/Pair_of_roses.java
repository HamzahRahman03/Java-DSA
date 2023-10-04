import java.util.*;

public class Pair_of_roses {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            input();
        }
    }

    public static void input() {

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        Pair(arr, m);
    }

    public static void Pair(int[] arr, int m) {
        Arrays.sort(arr);

        int diff = 1000001;
        int a=0;
        int b=0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= m) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == m) {
                        if ((arr[j] - arr[i]) < diff) {
                            diff = arr[j] - arr[i];
                            a = arr[i];
                            b = arr[j];
                        }
                    }
                }
            }
        }
        
        System.out.println("Deepak should buy roses whose prices are " + a + " and " + b + ".");

    }
}

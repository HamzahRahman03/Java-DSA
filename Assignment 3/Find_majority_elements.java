import java.util.*;

public class Find_majority_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Majority(arr, n);
    }

    public static void Majority(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 1;
        int printed = 0;
        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            }

            else {
                if (count > n / 3) {
                    System.out.print(arr[i - 1] + " ");
                    printed++;
                }

                count = 1;
            }
        }

        if (count > n / 3) {
            System.out.print(arr[n - 1] + " ");
            printed++;
        }

        if(printed == 0) {
            System.out.println("No Majority Elements");
        }
    }
}

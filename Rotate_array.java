import java.util.*;

public class Rotate_array {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        Change(arr, k);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }

    public static void Change(int[] arr, int k) {
        k = k % arr.length;
        for (int j = 1; j <= k; j++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = temp;
        }
    }
}

// Time complexity is high. So we use REVERSAL ALGORITHM for this question.
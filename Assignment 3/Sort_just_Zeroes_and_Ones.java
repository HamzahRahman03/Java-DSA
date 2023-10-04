import java.util.*;

public class Sort_just_Zeroes_and_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Sort(arr,n);
    }

    public static void Sort(int[] arr, int n) {
    int count =0;
        for (int i = 0; i < n ; i++) {
            if (arr[i] == 0) {
               count++;
            }
        }

        for (int i = 1; i <= count; i++) {

            System.out.print("0 ");
            
        }

        for (int i =1; i<=n-count; i++){
            System.out.print("1 ");
        }
    }

}

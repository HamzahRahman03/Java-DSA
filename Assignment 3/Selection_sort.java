import java.util.*;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if(n>0){
        long[] arr = new long[(int)(n)];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Sort(arr,(int)(n));
    }
    }

    public static void Sort(long[] arr, int n){
        for(int i = 0; i < n -1; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }

            long temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
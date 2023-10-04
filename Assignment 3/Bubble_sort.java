import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        BubbleSort(arr,n);
    }
    
    public static void BubbleSort(long[] arr, int n){
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr [j]){
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        
    }
}
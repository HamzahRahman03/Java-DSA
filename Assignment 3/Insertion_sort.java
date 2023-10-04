import java.util.*;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

        for(int i =0; i<arr.length; i++){
            Sort(arr, i-1, arr[i]);
        }

        for(int a = 0;a<arr.length; a++){
            System.out.print(arr[a]+" ");
        }
    }

    public static void Sort(int[] arr, int i, int item) {
        while(i>=0 && arr[i]>item){
            arr[i+1] = arr[i];
            i--;
        }

        arr[i+1]=item;
    }
}

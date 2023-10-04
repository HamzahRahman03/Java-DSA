import java.util.*;
public class Prime_SIEVE_algo {
    public static void main(String[] args){
        int n = 100;
        print(n);
    }

    public static void print(int n){
        boolean [] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;

        for(int i = 2; i*i<arr.length; i++){
            if(arr[i]){
                for(int j = 2; j*i< arr.length; j++){
                    arr[i*j] = false;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i]){
                System.out.print(i + " ");
            }
        }
    }
}

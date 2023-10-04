import java.util.*;
public class Max_value_in_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print(Max(arr));
    }

    public static int Max(int[] arr){
        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return  max;
    }
}
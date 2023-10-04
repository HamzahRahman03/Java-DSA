import java.util.*;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Reverse(arr);
    }

    public static void Reverse(int [] arr){
        int [] temp = new int [arr.length];
    for(int i =0; i < arr.length; i++){
        temp[i] = arr [arr.length -1 - i];
    }

    for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}

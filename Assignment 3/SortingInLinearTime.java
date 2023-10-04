import java.util.*;
public class SortingInLinearTime {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Sort(arr, n);
    }
    
    public static void Sort(int [] arr, int n){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i =0; i<n; i++){
            if(arr[i] == 0){
                count0++;
            }

            else if(arr[i] == 1){
                count1++;
            }

            else{
                count2++;
            }
        }
    
        for(int j =0; j<count0; j++){
            System.out.println("0");
        }

        for(int k =0; k<count1; k++){
            System.out.println("1");
        }

        for(int l =0; l<n-count0 - count1; l++){
            System.out.println("2");
        }
    }
    
}

import java.util.*;
public class Target_sum_triplets {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int target =sc.nextInt();

        Target_sum(arr,n,target);
    }
    
    public static void Target_sum(int[] arr, int n, int target){
        Arrays.sort(arr);
        for(int i =0; i<n-2; i++){
            if(arr[i]<=target){
                for(int j =i+1; j<n-1; j++){
                    if(arr[i]+arr[j]<=target){
                        for(int k = j+1; k<n; k++){
                            if (arr[i]+arr[j]+arr[k] == target){
                                System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                            }
                        }
                    }
                }
            }
        }
    }
}

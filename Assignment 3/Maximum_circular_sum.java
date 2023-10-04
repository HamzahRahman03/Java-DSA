import java.util.*;

public class Maximum_circular_sum { // Kaden's algo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int ans = Math.max(Sum(arr, n), KadenSum(arr, n));
            System.out.println(ans);
        }
    }

    public static int Sum(int[] arr, int n) {        
        int tsum = 0;
        for(int i = 0; i<n; i++){
             tsum=tsum+ arr[i];                           
        }

            int minsum = Integer.MAX_VALUE;   
            int sum =0; 
    
            for(int i =0; i<n; i++){
                 sum=sum+ arr[i];
                 minsum=Math.min(minsum, sum);
                 
                 if(sum>0){
                     sum=0;
                    }
               }
    

            int linearsum = tsum - minsum;
            return linearsum;

    }

    public static int KadenSum (int [] arr, int n){        
        int ans = Integer.MIN_VALUE;   
        int sum =0; 

        for(int i =0; i<n; i++){
             sum=sum+ arr[i];
             ans=Math.max(ans, sum);
             
             if(sum<0){
                 sum=0;
                }
           }

        return ans;
    }
}

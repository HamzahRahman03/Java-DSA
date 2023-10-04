// Find the max sum that any of the subarrays of this array can generate
public class Kadanes_algo {
    public static void main(String[] args){
        int [] arr={-2,-3,-1,-4};
        System.out.println(maxsum(arr));
    }

    public static int maxsum (int [] arr){        
        int ans = Integer.MIN_VALUE;   
        int sum =0; 

        for(int i =0; i<arr.length; i++){
             sum=sum+ arr[i];
             ans=Math.max(ans, sum);
             
             if(sum<0){
                 sum=0;
                }
           }

        return ans;
    }
}
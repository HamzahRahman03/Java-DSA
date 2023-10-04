// Find the max sum that any of the subarrays of this array can generate
public class Subarray {
    public static void main(String[] args){
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsum(arr));
    }

    public static int maxsum (int [] arr){        
        int ans = Integer.MIN_VALUE;   // gives -ve infinity

        for(int i =0; i<arr.length; i++){
            int sum =0;     //For every sub-array we initialise sum as 0
           for(int j=i; j<arr.length; j++){
             sum=sum+ arr[j];
             ans=Math.max(ans, sum);
           }
        } 

        return ans;
    }
}
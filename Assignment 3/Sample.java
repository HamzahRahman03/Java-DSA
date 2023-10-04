public class Sample {
    public static void main(String [] args){
        int [] arr = {8, 8, 9, 10, 7, 15, 12};
        System.out.println(minsum(arr));
    }
    
    public static int minsum (int [] arr){        
        int ans = Integer.MAX_VALUE;   
        int sum =0; 

        for(int i =0; i<arr.length; i++){
             sum=sum+ arr[i];
             ans=Math.min(ans, sum);
             
             if(sum>0){
                 sum=0;
                }
           }

        return ans;
    }
}

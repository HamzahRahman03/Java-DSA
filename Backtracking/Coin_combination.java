public class Coin_combination {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        Coin(arr, 8, 0, "", 0);

    }

    public static void Coin(int[] arr, int n, int sum, String ans, int idx){

        if(sum == n){
            System.out.println(ans + " ");
            return;
        }
      
        
    for(int i = idx; i<arr.length; i++){
        if(sum<n){
        Coin(arr, n, sum+arr[i], ans + arr[i], i);
        }
    }
    }

}

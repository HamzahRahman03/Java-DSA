public class Coin_permutation {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        Coin(arr, 8, 0, "");

    }

    public static void Coin(int[] arr, int n, int sum, String ans){

        if(sum == n){
            System.out.println(ans + " ");
            return;
        }
      
        
    for(int i =0; i<arr.length; i++){
        if(sum<n){
        Coin(arr, n, sum+arr[i], ans + arr[i]);
        }
    }
    }

}

import java.util.*;
public class Leetcode39 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Coin(arr, 8, 0, ll, 0, ans);
        System.out.println(ans);

    }

    public static void Coin(int[] arr, int n, int sum, List<Integer> ll, int idx, List<List<Integer>> ans){

        if(sum == n){
            // System.out.println(ll + " ");
            ans.add(new ArrayList<>(ll));
            return;
        }
      
        
    for(int i = idx; i<arr.length; i++){
        if(sum<n){
            ll.add(arr[i]);    //return type is boolean and we need address
        Coin(arr, n, sum+arr[i], ll, i, ans);
        ll.remove(ll.size()-1);
        }
    }
    }

}

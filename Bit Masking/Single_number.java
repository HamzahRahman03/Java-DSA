public class Single_number { // Leetcode 136
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 2, 5 };
        System.out.println(Single(arr));
    }

    public static int Single(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}

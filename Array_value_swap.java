public class Array_value_swap {
    public static void main(String[] args){
        int[]arr = {1, 34, 56,78,90};
        System.out.println(arr[0] + " " + arr[1]);
        swap(arr,0,1);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void swap(int[] arr, int i, int j){
        int a = arr[0];
        arr[0] = arr[1];
        arr[1] = a;
    }
    
}

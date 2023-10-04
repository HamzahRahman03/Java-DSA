public class Reverse_array2 {
    public static void main(String[] args){
        int[] arr={1,34,56,781,11,-7,90, 100};
        reverse(arr);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }

    // using 2-pointer approach
    public static void reverse(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }
    
}

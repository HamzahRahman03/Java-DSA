public class Reverse_array1 {
    public static void main(String[] args){
        int[] arr={1,34,56,781,11,-7,90,100};
        reverse(arr);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }

    // using 1-pointer approach
    public static void reverse(int [] arr){
        int i =0;
        while(i<arr.length/2){
        int temp = arr[i];
        arr[i]=arr[arr.length-i-1]; //length-1 cuz indexing of array starts from 1
        arr[arr.length-i-1]=temp;
        i++;
        }
    }
    
}

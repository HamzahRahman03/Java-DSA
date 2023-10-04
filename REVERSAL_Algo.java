public class REVERSAL_Algo {
    public static void main (String [] args){
        int[] arr={1,2,3,4,5,6,7};
        int k =3;
        Change(arr,k);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void Change(int[] arr, int k) {
        k = k % arr.length;
        int n =arr.length;
        reverse(arr,0,n-k-1); //first n elements
        reverse(arr, n-k, n-1); //last k elements
        reverse(arr,0,n-1); //complete
    }

    public static void reverse(int [] arr, int i, int j){
        while(i<j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }
}

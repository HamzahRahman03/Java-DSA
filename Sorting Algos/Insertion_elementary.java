// Given sorted array in which last element is  not sorted. Insert it into the correct index.

public class Insertion_elementary {
    public static void main(String[] args){
        int [] arr ={2,3,7,8,4};
        Insert(arr, 3, 4); //Here 3 is the index and 4 is the target value
        for(int i =0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
    }

    public static void Insert(int[] arr, int i, int item) {
        while(i>=0 && arr[i]>item){
            arr[i+1] = arr[i];      //value shfiting one by one
            i--;
        }

        arr[i+1]=item;
    }
}

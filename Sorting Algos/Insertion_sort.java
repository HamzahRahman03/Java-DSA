public class Insertion_sort {
    public static void main(String[] args){
        int [] arr ={2,3,7,8,4};
        for(int i =0; i<arr.length; i++){
            Sort(arr, i-1, arr[i]);
        }

        for(int a = 0;a<arr.length; a++){
            System.out.print(arr[a]+" ");
        }
    }

    public static void Sort(int[] arr, int i, int item) {
        while(i>=0 && arr[i]>item){
            arr[i+1] = arr[i];
            i--;
        }

        arr[i+1]=item;
    }
}

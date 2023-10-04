public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 2, 1, 4 };
        sort(arr);
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if (arr[j]< arr[min]){
                    min=j;
                }
            }

            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}

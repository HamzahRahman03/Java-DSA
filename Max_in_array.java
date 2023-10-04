public class Max_in_array {
    public static void main(String[] args){
        int[] arr= {1,34,56,781,11,-7,90};
        System.out.println(max(arr));       
    }

    public static int max(int[] arr){
        int i =0;
        int largest = arr[0];
        while(i<arr.length){
            if(arr[i]>largest){
                largest=arr[i];
            }
            i++;
        }
        return largest;
    }
    
}

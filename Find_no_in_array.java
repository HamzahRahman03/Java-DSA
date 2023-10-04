public class Find_no_in_array {
    public static void main(String[] args){
        int[] arr= {1,34,56,78,11,-7,90};
        System.out.println(find(arr));       
    }

    public static int find(int[] arr){
        int i = 0;
        while(i <= arr.length){
            if(arr[i]==5){
                return i;
            }          
            i++;
        }
        return -1;
    }
    
}

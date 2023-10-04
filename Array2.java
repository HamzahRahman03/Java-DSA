import java.util.*;
public class Array2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int [n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Display(arr);            
    }    

    public static void Display(int[] arr2){     //arr2 is a new variable looking at previous array and not a new array
        for(int i=0; i< arr2.length; i++){
            System.out.println(arr2[i] + " ");
        }
    }
}

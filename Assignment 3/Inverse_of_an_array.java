import java.util.*;
public class Inverse_of_an_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr = new int [n];

        
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
       
        Inverse(arr,n);

    }
    
    public static void Inverse(int[] arr,int n){
        int [] temp =  new int[n];
        for(int i =0; i<n; i++){
            int a = arr[i];
            temp[a]=i;
        }     
        
        for(int i =0; i<n; i++){
            System.out.print(temp[i] + " ");
        }
    }
}
import java.util.*;

public class PrintUpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i =0 ; i<n; i++){
            for(int j = 0; j<n; j++){
            arr[i][j] = sc.nextInt();
            }
        }

        Print(arr, n);
    }

    public static void Print(int [] [] arr, int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){

                if(j<i){
                    System.out.print("0 ");
                }
                
                else{
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
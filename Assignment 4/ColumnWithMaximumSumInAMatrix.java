import java.util.*;

public class ColumnWithMaximumSumInAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i <=n-1; i++) {
            for (int j = 0; j <= n-1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        MaxColumn(arr, n);
    }

    public static void MaxColumn(int[][]arr, int n){
        int idx = 1;
        int sum = 0;
        int ans = 0;
        for(int i =0; i<=n-1; i++){
            for(int j =0; j<=n-1; j++){
                sum += arr[j][i];
            }

            if(sum>=ans){
                ans = sum;
                idx = i;
            }

            sum = 0;
        }
        
         System.out.println(idx + 1 + " " + ans);
    }

}

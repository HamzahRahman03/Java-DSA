import java.util.*;

public class ABooleanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Print(arr, n, m);
    }

    public static void Print(int[][] arr, int n, int m) {
        int [][] temp = new int  [n] [m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (arr[i][j] == 1) {
                    for (int k = 0; k < n; k++) {
                        for (int l = 0; l < n; l++) {
                            temp[k][j] = 1;
                            temp[i][l] = 1;
                        }
                    }
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }

    }
}

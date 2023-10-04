import java.util.*;
public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = 1;
        int space = n - 1;
        int val = n;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while (j <= star) {
                if(j==star/2+1){
                    System.out.print("0 ");
                }

                else{
                    System.out.print(val + " ");
                }

                if (j <= star/2 ) {
                    val++;
                }

                else {
                    val--;
                }

                j++;
            }

            System.out.println();
            row++;
            star += 2;
            space--;
        }

    }
}

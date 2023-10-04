import java.util.*;

public class Q32 {
    public static void main(String[] args) {
        Scanner sdc = new Scanner(System.in);
        int n = sdc.nextInt();

        int row = 1;
        int star = 1;
        int val = 1;

        while (row <= 2*n-1) {
            int i = 1;
            int k = 1;
            while (i <= star) {
                System.out.print(val + " \t");
                
                if(i!=star){
                    System.out.print("*\t");
                }
                i++;
            }

            if (row <n) {
                star ++;
                val++;
            }

            else {
                star --;
                val--;
            }

            System.out.println();
            row++;
        }
    }
}

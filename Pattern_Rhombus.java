import java.util.*;

public class Pattern_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = 1;
        int space = n - 1;
        int val = 1;

        while (row <= 2 * n - 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }

            int j = 1;
            while (j <= star) {
                System.out.print(val + "\t");

                if (j <= star / 2) {
                    val++;
                }

                else {
                    val--;
                }

                j++;
            }

            if (row < n) {
                star += 2;
                space--;
                val += 2;
            } 
            
            else {
                star -= 2;
                space++;
            }

            System.out.println();
            row++;
        }

    }
}

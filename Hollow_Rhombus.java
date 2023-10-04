import java.util.*;

public class Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space1 = n - 1;
        int star = n;
        int space2 = n - 2;

        while (row <= n) {

            int i = 1;
            while (i <= space1) {
                System.out.print("  ");
                i++;
            }

            if (row == 1 || row == n) {
                int j = 1;
                while (j <= star) {
                    System.out.print("*");
                    j++;
                }
            }

            else {
                System.out.print("*");

                int a = 1;
                while (a <= space2) {
                    System.out.print(" ");
                    a++;
                }

                System.out.print("*");
            }

            System.out.println();
            row++;
            space1--;
        }
    }
}

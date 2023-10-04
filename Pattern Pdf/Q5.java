import java.util.*;

public class Q5 {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int row=1;
        int star=n;
        int space=0;

        while(row<=n){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }

            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }

            System.out.println();
            row++;
            star--;
            space++;
        }
    }
}

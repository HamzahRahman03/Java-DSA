import java.util.*;

public class Q4 {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int row=1;
        int star=1;
        int space=n-1;

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
            star++;
            space--;
        }
    }
}

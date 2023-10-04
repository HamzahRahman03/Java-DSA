import java.util.*;
public class Q22 {
    public static void main(String[]  args){
        Scanner sdc= new Scanner(System.in);
        int n=sdc.nextInt();

        int row=1;
        int star=n;
        int space=-1;

        while(row<=n){
            int j =1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }

            int i =1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            

            int k =1;
            if(row==1){k=2;}
            while(k<=star){
                System.out.print("* ");
                k++;
            }

            System.out.println();
            row++;
            star--;
            space+=2;
        }
    }    
}

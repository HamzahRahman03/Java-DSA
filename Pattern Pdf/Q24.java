import java.util.*;
public class Q24 {
    public static void main(String[]  args){
        Scanner sdc= new Scanner(System.in);
        int n=sdc.nextInt();

        int row=1;
        int star=1;
        int space=n-1;
        int val=1;

        while(row<=n){
            int j =1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }

            int i =1;
            while(i<=star){
                System.out.print(val+" \t");
                i++;
            }

            System.out.println();
            row++;
            star+=2;
            space--;
            val++;
        }
    }    
}

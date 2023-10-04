import java.util.*;
public class Q29 {
    
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int row=1;
        int star=1;
        int space=n-1;
        int val=1;

        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }

            int j =1;
            while(j<=star){

                if(j==1 || j==star){
                System.out.print(val+ " ");
                }

                else{
                    System.out.print("0 ");
                }
                j++;
            }

            System.out.println();
            row++;
            star+=2;
            space--;
            val++;
        }
    }
}

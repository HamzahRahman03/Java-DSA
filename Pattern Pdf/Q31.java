import java.util.*;
public class Q31 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row=1;
        int star=n;
        int symbol =n;

        while(row<=n){
            int val=n;
            int i =1;
            while(i<=n){

                if(i==symbol){
                    System.out.print("* ");
                }

                else{
                System.out.print(val + " ");                
                }
                
                i++;
                val--;
            }

            System.out.println();
            row++;
            symbol--;
        }
    }
}

import java.util.*;
public class Q30 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row=1;
        int star=n;

        while(row<=n){
            int val=n;
            int i =1;
            while(i<=n){
                System.out.print(val + " ");
                i++;
                val--;
            }

            System.out.println();
            row++;
        }
    }
}

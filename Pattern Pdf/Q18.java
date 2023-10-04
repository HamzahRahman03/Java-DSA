import java.util.*;

public class Q18 {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int row=1;
        int space=n/2;
        int star=1;

        while(row<=n){
            int j =1;
            while(j<=space){
            System.out.print("  ");
            j++;
            }

            int i =1;
            while(i<=star){
            System.out.print("* ");
            i++;
            }

            if(row<=n/2){
                star+=2;
                space--;
            }

            else{
                star-=2;
                space++;
            }

            System.out.println();
            row++;
        }
    }
}

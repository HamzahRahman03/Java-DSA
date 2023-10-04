import java.util.*;
public class Pattern_Mountain {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row =1;
        int star =1;
        int space=2*n-3;
        
        while(row<=n){
            int val=1;
            int i =1;
            while(i<=star){
                System.out.print(val+ " ");
                i++;
                val++;
            }

            val--;

            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }


            int k=1;
            if(row==n){k=2;
            val--;}
            while(k<=star){
                System.out.print(val+ " ");
                k++;
                val--;
            }
            

            System.out.println();
            row++;
            space-=2;
            star++;
            val++;
        }
    }    
}

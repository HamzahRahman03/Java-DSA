import java.util.*;
public class Pascal_Triagle {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();

        int row=0;
        int star=1;
                
        while(row<n){
            int val=1;
            int i=0;
            while(i<star){
                System.out.print(val + " ");
                val = ((row-i)*val)/(i+1);
                i++;
            }

            System.out.println();
            row++;
            star++;
        }
    }
}

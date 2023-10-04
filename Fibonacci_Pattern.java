import java.util.*;
public class Fibonacci_Pattern {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int row=1;
        int star=1;
        int a=0;
        int b=1;

        while(row<=n){

            int i=1;
            while(i<=star){
                int c=a+b;
            System.out.print(a + "\t");
            a=b;
            b=c;
            i++;
            }

            System.out.println();
            row++;
            star++;
        }

    }    
}

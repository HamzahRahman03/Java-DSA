import java.util.*;
public class Fibonacci {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();

        int a=0;
        int b=1;

        int i=1;
        while(i<=n){
            int c=a+b;
            a=b;
            b=c;
            i++;
        }
        System.out.println(a);
    }    
}

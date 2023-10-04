import java.util.*;
public class FindSquareRoot {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        while(n>=0){
        long i = 0;
        while(i*i<=n){
            if(i*i == n){
                System.out.println(i);
                return;
            }

        i++;
        }

        n--;

        }

    }
}
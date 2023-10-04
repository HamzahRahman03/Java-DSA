import java.util.*;
public class Print_reverse {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        System.out.println(reverse(n));
    }

    public static int reverse(int n){
        int sum = 0;
        for (int i = 0; n>0; i++){
            int rem = n%10;
            sum=sum*10 + rem;
            n=n/10;
        }

        return sum;
    }
}

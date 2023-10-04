import java.util.*;
public class Armstrong_no {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();  
        System.out.println(Armstrong_or_not(n));  
    }

    public static boolean Armstrong_or_not(int n){
        int c = count(n);
        int sum = 0;
        int p = n;
        while(n>0){
            int rem = n%10;
            sum = (int)(sum + Math.pow(rem,c));
            n=n/10;
        }

        return sum ==p;
    }

    public static int count(int n){
        int i = 0;
        while(n>0){
            n=n/10;
            i++;
        }
        return i;
    }    
}

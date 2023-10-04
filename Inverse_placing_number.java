import java.util.*;
public class Inverse_placing_number {
    public static void main(String [] args){
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();

            int sum=0;
            int val=1;
            while(n>0){
                int rem=n%10;
                n=n/10;
                sum = (int)(sum + val * Math.pow (10 , rem - 1));  
                // sum+= will not be needing typecasting
                
                val++;                              
            }

            System.out.println(sum);
    }
}

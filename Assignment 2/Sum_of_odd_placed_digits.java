import java.util.*;
public class Sum_of_odd_placed_digits{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();

        System.out.println(Odd(n));
        System.out.println(Even(n));
    }

    public static int Odd(int n){
        int sum = 0;
        for(int i=1; n>0; i++){
            if(i%2!=0){
                int rem =n%10;
                sum+=rem;  
            }
            n=n/10;
        }
        return sum;
    }
    
    public static int Even(int n){
        int sum = 0;
        for(int i=0; n>0; i++){
            if(i%2!=0){
                int rem =n%10;
                sum+=rem;  
            }
            n=n/10;
        }
        return sum;
    }
}
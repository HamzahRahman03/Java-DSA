import java.util.*;
public class VonNuemenLovesBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i =0; i<t; i++){
            int n=sc.nextInt(); 
            Decimal(n);
        }
    }

        public static void Decimal(int n){
            int sum=0;
        int i=1;

        while(n>0){
            int rem = n%10;
            sum=sum+rem*i;
            i=i*2;
            n=n/10;
        }

        System.out.println(sum);
    }
}

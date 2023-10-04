import java.util.*;

public class Simple_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        
        if (n >= 0) {
            System.out.println(n);
            sum+=n;

            while(sum >= 0) {
                int m = sc.nextInt();
                sum+=m;
                if(sum>=0){
                    System.out.println(m);
                }
            }
        }
    }
}
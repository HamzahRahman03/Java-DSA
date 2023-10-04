import java.util.*;

public class Count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit=sc.nextInt();

        System.out.println(CountDigits(n,digit));
    }

    public static int CountDigits(int n, int digit) {
        int count = 0;
        for(int i =0; n>0; i++){
            int rem=n%10;
            if(rem==digit){
                count++;
            }

            n=n/10;
        }
        return count;
    }

}

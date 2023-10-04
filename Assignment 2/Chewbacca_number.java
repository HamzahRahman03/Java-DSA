import java.util.*;

public class Chewbacca_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long sum = 0;
        long pow = 1;
        while (n > 0) {
            long rem = n % 10;
            if (n != 9) {
                if (rem > 9 - rem) {
                    rem = 9 - rem;
                }

            } 
            
            else {
                rem=9;
            }

            sum += rem * pow;

            pow *= 10;
            n /= 10;
        }

        System.out.println(sum);
    }

}

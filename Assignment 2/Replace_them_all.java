import java.util.*;

public class Replace_them_all {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long sum = 0;
        long pow = 1;

        if (n == 0) {
            sum = 5;
        }

        else{
        for (long i = 0; n > 0; i++) {
            long rem = n % 10;

            if (rem == 0) {
                sum = sum + 5* pow;
            }

            else {
                sum = sum + rem* pow;
            }
            n /= 10;
            pow *= 10;
        }
    }
        System.out.println(sum);
    }
}

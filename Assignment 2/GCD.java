import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(GCD(n, m));
    }

    public static int GCD(int n, int m) {
        int dividend = n;
        int divisor = m;
        int rem = dividend % divisor;
        while (rem > 0) {
            dividend = divisor;
            divisor = rem;
            rem = dividend % divisor;
        }

        return divisor;
    }
}

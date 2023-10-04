import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int GCD = Factor(n,m);
        int LCM = (n*m)/GCD;
        System.out.println(LCM);
    }

    public static int Factor(int n, int m) {
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

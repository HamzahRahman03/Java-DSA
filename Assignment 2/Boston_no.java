import java.util.*;

public class Boston_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count > 0) {

            int sum2 = FactorSum(n);
            int sum1 = 0;
        while (n > 0) {
            int rem = n % 10;
            sum1 += rem;
            n /= 10;
        }


            if (sum1 == sum2) {
                System.out.println("1");
            }

            else {
                System.out.println("0");
            }

        }

        else {
            System.out.println("0");
        }
    }

    public static int FactorSum(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }
        return sum;
    }
}

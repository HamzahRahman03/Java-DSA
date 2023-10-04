import java.util.*;

public class Conversion_any2any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int src = sc.nextInt();
        int db = sc.nextInt();
        int n = sc.nextInt();

        int decimal = toDecimal(src, n);
        int result = toDestination(db, decimal);
        System.out.println(result);
    }

    public static int toDecimal(int src,int n) {
        int sum = 0;
        int pow = 1;
        for (int i = 1; n != 0; i++) {
            int rem = n % 10;
            sum += rem * pow;
            pow = pow * src;
            n = n / 10;
        }
        return sum;
    }

    public static int toDestination(int db, int n) {
        int sum = 0;
        int pow = 1;
        for (int i = 1; n != 0; i++) {
            int rem = n % db;
            sum += rem * pow;
            pow = pow * 10;
            n = n / db;
        }
        return sum;
    }

}

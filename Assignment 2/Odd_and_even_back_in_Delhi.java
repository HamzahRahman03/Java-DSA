import java.util.*;

public class Odd_and_even_back_in_Delhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int n = sc.nextInt();

            int oddsum = 0;
            int evensum = 0;
            while (n > 0) {
                int rem = n % 10;
                if (rem % 2 != 0) {
                    oddsum += rem;
                }

                else {
                    evensum += rem;
                }

                n /= 10;
            }

            if (oddsum % 3 == 0 || evensum % 4 == 0) {
                System.out.println("Yes");
            }

            else {
                System.out.println("No");
            }
        }
    }

}

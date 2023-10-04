public class PowerLOGN {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        System.out.println(Power(a, b));
    }

    public static int Power(int a, int b) {
        if (b == 0) {
            return 1;
        }

        int ans = Power(a, b / 2);
        ans = ans * ans;

        if (b % 2 != 0) {
            ans = ans * a;
        }

        return ans;
    }
}

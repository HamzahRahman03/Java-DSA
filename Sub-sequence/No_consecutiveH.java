public class No_consecutiveH {
    public static void main(String[] args) {
        int n = 3;
        Coin_toss(n, "");
    }

    public static void Coin_toss(int n, String ans) {
        if (n == 0) {
            System.out.println(ans + " ");
            return;
        }

        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
            Coin_toss(n - 1, ans + "H");
        }

        Coin_toss(n - 1, ans + "T");

    }

}

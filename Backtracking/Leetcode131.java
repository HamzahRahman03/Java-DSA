import java.util.*;

public class Leetcode131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ques = sc.next();

        List<String> ll = new ArrayList<String>();
        List<List<String>> ans = new ArrayList<>();
        Partitioning(ques, ll, ans);
        System.out.println(ans);
    }

    public static void Partitioning(String ques, List<String> ll, List<List<String>> ans) {
        if (ques.length() == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }

        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);

            if(Palindrome(s)){
                ll.add(s);
            Partitioning(ques.substring(i), ll, ans);
            ll.remove(ll.size() - 1);
            }
        }
    }

    public static boolean Palindrome(String s){
        int i = 0;
         int j = s.length() - 1;

         while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

                i++;
                j--;
            }

            return true;
    }
}

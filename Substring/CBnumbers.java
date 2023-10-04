import java.util.*;
public class CBnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
        PrintSubstring(s);
    }

    public static void PrintSubstring(String s) {
        int count = 0;
        boolean[] visited = new boolean [s.length()];
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                String str = s.substring(i, j);
                if (IsCBnumber(Long.parseLong(str)) == true && IsVisited(visited, i ,j-1)==true) {
                    count++;
                    for(int k=i; k<j; k++){
                        visited[k]=true;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean IsVisited( boolean [] visited, int si, int ei){
        for (int i =si; i<=ei; i++){
            if(visited[i]== true){
                return false;
            }
        }
        return true;
    }

    public static boolean IsCBnumber(long n) {
        if (n == 0 || n == 1) {
            return false;
        }

        int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (n % arr[i] == 0) {
                return false;
            }
        }

        return true;
    }
}

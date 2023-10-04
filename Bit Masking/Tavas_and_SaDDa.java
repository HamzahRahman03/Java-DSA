import java.util.*;
public class Tavas_and_SaDDa{ //Codeforces535B 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();

        System.out.println(Index(str));
    }

    public static int Index(String str) {
        int n = str.length();
        int count = (1 << n) - 2;

        int pos = 0;
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i)=='7'){
                count+=(1<<pos);
            }
            pos++;
        }
        return count+1;
    }
}

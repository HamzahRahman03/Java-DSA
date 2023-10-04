import java.util.*;
public class Substring_lengthwise{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        PrintSubstring(s);
    }

    public static void PrintSubstring(String s){
        for ( int len=1; len<=s.length(); len++){
            for(int j=len; j<=s.length(); j++){
                int i = j - len;
                System.out.print(s.substring(i,j)+ "|");
            }
            System.out.println();
        }
    }
}
import java.util.*;
public class NobitaScoredGoodMarks {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();

        int [] a1 = new int[t];
        int [] a2 = new int[t];

        for(int i =0 ; i<t; i++){
            a1[i] = sc.nextInt();
            a2[i] = sc.nextInt();
        }

        Candies(a1, a2);
    }

    public static void Candies(int [] a1, int [] a2){
        for(int i = 0; i<a1.length; i++){
            int rem = a1[i] % a2[i];

            for(int j = 1; j < rem; j++){
                if((a1[i] + j) % a2[i] == 0){
                    rem = j;
                }
            }
            
            System.out.println(rem);
        }
    }
}
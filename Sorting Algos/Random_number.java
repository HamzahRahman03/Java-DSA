import java.util.*;
public class Random_number {
    public static void main(String[] args){
        int si = 0;
        int ei = 100;

        Random r = new Random();

        for(int i = 0; i<10; i++){
            int item = r.nextInt(ei - si + 1) + si;
            System.out.print(item + " ");
        }
    }
    
}

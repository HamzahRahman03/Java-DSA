import java.util.*;
public class Print_Series {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int count =0;
        for(int i=1; count<n; i++){
            int num =3*i+2;
            
            if(num % m !=0){
                System.out.println(3*i+2);
                count++;
            }
        }
    }
    
}

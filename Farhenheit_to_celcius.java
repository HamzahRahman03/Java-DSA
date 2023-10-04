import java.util.*;
public class Farhenheit_to_celcius {
    public static void main(String [] args) {
        // Your Code Here

		Scanner sc= new Scanner(System.in);
		int minf = sc.nextInt();
		int maxf = sc.nextInt();
        int gap=sc.nextInt();

        int i=minf;
        while(i<=maxf){
		int c = (int)((5/9.0)*(i - 32));
		System.out.println(i +"\t"+ c);

        i+=gap;
        }
    }
}


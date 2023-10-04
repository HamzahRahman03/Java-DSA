import java.util.*;
public class Q25{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row =1;
		int space = n-1;
		int star = 1;
		int val=1;
		
		while (row<=n)
		{   
		    int j=1;
		    while(j<=space)
		    {
		        System.out.print("\t");
		        j++;
		    }
		    
		    int k=1;
		    while(k<=star)
		    {
		        System.out.print(val+"\t");
		        k++;
		        val++;
		    }
		    
		    System.out.println();
		    row++;
		    star+=2;
		    space--;
		}
	}
}

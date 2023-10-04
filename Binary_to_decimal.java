public class Binary_to_decimal {
    public static void main(String[] args){
        int n=1010010; 
        // We cannot give a number starting with 0 as input here as the system will take it as octet input and not decimal

        int sum=0;
        int i=1;

        while(n>0){
            int rem = n%10;
            sum=sum+rem*i;
            i=i*2;
            n=n/10;
        }

        System.out.println(sum);
    }
}

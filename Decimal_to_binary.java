public class Decimal_to_binary {
    public static void main(String[] args){
        int n=-478; 
        // Take n=081 and 091 -> out of range 
        // 041 will be taken as octet input and not decimal input

        int sum=0;
        int i=1;

        while(n>0){
            int rem = n%2;
            sum=sum+rem*i;
            i=i*10;
            n=n/2;
        }

        System.out.println(sum);
    }
}

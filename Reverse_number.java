public class Reverse_number {
    public static void main(String[] args){
        int n=3467;

        int i=1;
        int sum=0;

        while(n>0){
            int rem=n%10;
            sum= sum*10+ rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}

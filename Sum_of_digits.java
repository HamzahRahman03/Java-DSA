public class Sum_of_digits {
    public static void main(String[] args){
        int n=3467;

        int i =1;
        int sum=0;

        while(n>0){
            int rem = n%10;
            sum+=rem;
            n=n/10;
        }

        System.out.println(sum);
    }
}

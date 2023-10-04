public class Check_bit {
    public static void main(String [] args){
        int n = 48;
        int i = 5;
        System.out.println(Isset(n,i));

    }
    
    public static int Isset(int n, int i){
        int mask = (1<<i);
        if ( (n & mask) !=0){
            return 1;
        }
        
        else{
            return 0;
        }
    }
}

public class For_demo{
    public static void main(String[] args){
        for(byte b=0; b<127; b++){ 
            // b<128 will be aan infinite loop
            System.out.println(b);
        }
        System.out.println();
        System.out.println();
        for(byte a=0; a<127; a--){
            System.out.println(a);
        }
    }
}
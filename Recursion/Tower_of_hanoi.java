public class Tower_of_hanoi {
    public static void main(String [] args){
        int n = 3;
        Tower(n, "A", "B", "C");
    }
 
    public static void Tower(int n, String src, String help, String des ){

        if(n==0){
            return;
        }

        Tower(n-1, src, des, help);
        System.out.println("Move " + n + "th disc from " + src + " to " + des);
        Tower(n-1, help, src, des);
    }
}

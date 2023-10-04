public class Function4 {
    static int val = 100; //global variable is stored in heap memory
        public static void main(String [] args){
        int a =2;
        System.out.println("Hey");
        System.out.println(val);
        System.out.println(add(a,45));
        System.out.println("Bye");
        System.out.println(val);
    }

    public static int add(int x, int y){
        int z = x+y;
        System.out.println(z);
        int val =90;
        Function4.val+=5;
        // use class_name. to access global variable when the local variable has the name same
        
        System.out.println(Function4.val);
        return z-2;
    }
    
}

public class Method1 {
    public static void main(String[] args){
        System.out.println("Hey");
        Add();
        System.out.println("Bye");
    }

    public static void Add(){
        int a = 5;
        int b = 10;
        int c = a+b;
        sub();
        System.out.println(c);
    }

    public static void sub(){
        int a = 5;
        int b = 10;
        int c = a-b;
        System.out.println(c);
    }
}

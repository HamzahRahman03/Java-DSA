public class Function_1 {
    public static void main(String[] args){
        int a=2;
        int b =3;
        System.out.println("Hey");
        add(a,b);
        System.out.println("Bye");
    }

    public static void add(int a, int b){
        int c = a+b;
        sub(a,c);
        System.out.println(c);
    }

    public static void sub(int a, int b){
        int c = b-a;
        System.out.println(c);
    }
    
}

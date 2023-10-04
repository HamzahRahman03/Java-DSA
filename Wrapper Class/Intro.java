public class Intro{
    public static void main(String [] args){
        int a= 10;
        Integer a1=15;  //autoboxing
        a1 = a1+10;
        System.out.println(a1);

        Integer b1 = 19;
        Integer b2 = 19;
        Integer c1 = 190;
        Integer c2 = 190;
        System.out.println(b1==b2);
        System.out.println(c1==c2);
        a1 = a; //autoboxing

        int b = b1; //unboxing
    }
}
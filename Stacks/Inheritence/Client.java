package Inheritence;

public class Client {
    public static void main(String[] args) {
        // Case 1
        P obj1 = new P();

        System.out.println(obj1.d);
        System.out.println(obj1.d1);
        obj1.fun();
        obj1.fun1();

        System.out.println();
        System.out.println();

        // Case 2
        P obj2 = new C();
        System.out.println(obj2.d);
        System.out.println(obj2.d1);
        System.out.println(((C) (obj2)).d);
        System.out.println(((C) obj2).d2);
        obj2.fun(); // method overriding
        obj2.fun1();
        ((C) (obj2)).fun2(); // typecasting function cuz of compile time error

        System.out.println();
        System.out.println();

        // Case 3
        // C obj3 = new P();
        // System.out.println(obj3.d);
        // System.out.println(obj3.d1);
        // System.out.println(obj3.d2);
        // obj3.fun();

        // Case 4
        C obj4 = new C();
        System.out.println(obj4.d);
        System.out.println(obj4.d1);
        System.out.println(obj4.d2);
        System.out.println(((P) obj4).d); // specifically accessing fun in P
        obj4.fun();
        obj4.fun1();
        obj4.fun2();
    }

}

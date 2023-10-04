public class Function2 {
    public static void main(String [] args){
        int a =2;
        int b =3;
        System.out.println("Hey");

        /* int sum = add(a,b)
         System.out.println(sum); */
        System.out.println(add(a,b));
        System.out.println("Bye");
    }

    public static long add(int x, long y){     
        // Small data types can be stored in lagrer data types 
        // e.g. int can be stored in long, float can be stored in double

        long z = x+y;
        return z;
    }
    
}

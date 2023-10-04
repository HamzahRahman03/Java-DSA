public class Power {    //n complexity as n frames with  constant task
    public static void main(String [] args){
        int a = -5;
        int b = 4;

        System.out.println(power(a,b));
    }

    public static int power(int a , int b ){
        if(b==1){   //b==0 >> return 1;
            return a;
        }
        int p = power(a, b -1);
        return a * p;
    }
    
}

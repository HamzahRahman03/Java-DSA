import java.util.*;
public class Farhenheit_to_Celcius {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();

        Conversion(min,max,step);
    }

    public static void Conversion(int min, int max, int step){

        while (min <= max){
        int celcius = (min - 32) * 5/9;
        System.out.println(min + " " + celcius);
        min =  min + step;
        }
    }    
}

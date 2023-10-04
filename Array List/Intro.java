import java.util.*;
public class Intro{
    public static void main(String[] agrs){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1,40);     //index range 0 to size
        list.add(80);
        list.add(90);
        System.out.println(list);

        System.out.println(list.size());
        
        System.out.println(list.get(2));
        
        System.out.println(list.remove(2));
        System.out.println(list);

        list.set(2, -11);
        System.out.println(list);

        //Print arraylist
        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
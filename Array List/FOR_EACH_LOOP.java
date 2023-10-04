import java.util.ArrayList;

public class FOR_EACH_LOOP {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(80);
        list.add(90);
        System.out.println(list);

        for(int val : list){
            System.out.println(val + " ");
        }
    }
}

// Insert an element at the bottom of the stack
import java.util.Stack;
public class Insert_element {
    public static void main(String[] arg){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        AddElement(st, 8);
        System.out.println(st);
    }

    public static void AddElement(Stack<Integer> st, int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }

        int x = st.pop();
        AddElement(st, item);
        st.push(x);
    }
}

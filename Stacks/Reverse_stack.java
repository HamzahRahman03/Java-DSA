// Reverse stack without using extra stack

// complexity n^2

import java.util.Stack;
public class Reverse_stack {
    public static void main(String [] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }
    
    public static void Reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int x = st.pop();
        Reverse(st);
        AddElement(st, x);
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

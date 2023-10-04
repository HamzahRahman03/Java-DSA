public class Stack_client {
    public static void main(String [] args) throws Exception{
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.Display();
        st.push(40);
        st.push(50);

        System.out.println((st.peek()));

        st.Display();

        st.push(80);
    }
    
}

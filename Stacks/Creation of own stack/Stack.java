public class Stack {
    private int [] arr;
    private int idx = -1;

    public Stack(){
        arr = new int [5];
    }

    public Stack(int n){
        arr = new int [n];
    }
    
    public boolean isEmpty(){
        return idx == -1;
    }

    public boolean isFull(){
        return idx == arr.length - 1;
    }

    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Stack is full");
        }

        idx++;
        arr[idx] = item;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }

        int rv = arr[idx];
        idx--;
        return rv;
    }

    public int peek(){
        return arr[idx];
    }

    public int size(){
        return idx + 1;
    }

    public void Display(){
        for(int i = 0; i <= idx; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
}

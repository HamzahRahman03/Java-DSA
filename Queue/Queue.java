public class Queue{ //java does not have in-built queue class

    private int [] arr;

    private int front = 0;;
    
    private int size = 0;   //current size and not capacity

    public Queue(){
        arr = new int[5];
    }

    public Queue(int n){
        arr = new int[n];
    }

    public boolean isEmpty(){
        return size == 0;
    }
    
    public boolean isFull(){
        return size == arr.length;
    }

    // public void Enqueue(int item){  //Linear
    //     arr[size] = item;
    //     size++;
    // }

    public void Enqueue(int item) throws Exception{  //Circular
        if(isFull()){
            throw new Exception("Queue is full");
        }

        int idx = (front + size) % arr.length;
        arr[idx] = item;
        size++;
    }

    // public int Dequeue(){   //Linear
    //     int rv = arr[front];
    //     front++;
    //     size--;
    //     return rv;
    // }
    
    public int Dequeue() throws Exception{   //Circular
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int rv = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return rv;
    }

    public int getFront() throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }

        int rv = arr[front];
        return rv;
    }

    public void Display(){
        for(int i = 0; i < size; i++){
            int idx = (front + i)% arr.length;
            System.out.print(arr[idx] + " ");
        }
        
        System.out.println();
    }
}
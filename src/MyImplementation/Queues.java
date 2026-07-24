package MyImplementation;

public class Queues {
    private int[]arr;
    private int front;
    private int rear;
    private int capacity;

    public Queues(int size){
        capacity=size;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }


    public void enqueue(int val){
        if(rear==capacity-1){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear]=val;
    }

    public int dequeue(){
        if(rear==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[front];
        front++;
        return val;
    }
    public int front(){
        return front;
    }
    public int rear(){
        return rear;
    }
}

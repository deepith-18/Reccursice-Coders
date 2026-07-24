package MyImplementation;

public class Stacks {
    private int[] arr;
    private int top;
    private int capacity;

    public Stacks(int size ){
        capacity = size;
        arr = new int[capacity];
        top=-1;
    }

    public void push(int val){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[++top]=val;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }




    private boolean isEmpty(){
        return top==-1;
    }

    private boolean isFull() {
        return top == capacity-1;
    }

}

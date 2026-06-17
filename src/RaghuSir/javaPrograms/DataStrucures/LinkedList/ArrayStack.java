package RaghuSir.javaPrograms.DataStrucures.LinkedList;

public class ArrayStack {
    private Integer[]stack;
    private int top,capacity;

    ArrayStack(Integer capacity){
        this.capacity=capacity;
        this.stack = new Integer[capacity];
        this.top = -1;
    }

    public void push(Integer data) {
        if (top == capacity - 1) {
            System.out.println("Stack is Full");
            return;
        }
        stack[++top] = data;
    }

    public Integer pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return null;
        }
        return stack[top--];
    }

    public Integer peek(){
        if(top ==-1){
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    @Override
    public String toString(){
        String res="[";

        for(int i=top;i>=0;i--){
            res+=stack[i];

            if(i>0){
                res+=", ";
            }
        }
        res+="]";
        return res;
    }
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println("Peek: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println(stack);
    }
}

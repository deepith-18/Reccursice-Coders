package RaghuSir.javaPrograms.DataStrucures.LinkedList;

public class SLStack {

    static class Node{
        Integer data;
        Node next;

         Node(Integer data){
            this.data=data;
        }
    }

    private Node top;


    public void push(Integer data){
        Node n = new Node(data);

        n.next=top;
        top=n;
    }

    public Integer pop(){
        if(top == null){
            System.out.println("Stack is Empty");
            return null;
        }
        Integer data = top.data;
        top = top.next;

        return data;
    }
    @Override
    public String toString(){
        String res="[";

        Node temp=top;

        while(temp!=null){
            res+=temp.data;

            if(temp.next!=null){
                res+=", ";
            }
            temp = temp.next;
        }
        res+="]";
        return res;
    }

    public Integer peek(){
        if(top == null ){
            System.out.println("Stack is Empty");
            return null;
        }
        return top.data;
    }

    public static void main(String[] args) {
        SLStack stack = new SLStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println("Peek: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println(stack);
    }
}

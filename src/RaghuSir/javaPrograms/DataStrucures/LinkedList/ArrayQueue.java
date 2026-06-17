package RaghuSir.javaPrograms.DataStrucures.LinkedList;

public class ArrayQueue {
   private Integer[]que;
    private int front,rear,capacity;

    ArrayQueue(Integer capacity){
        this.capacity=capacity;
        this.que= new Integer[capacity];
        this.front=-1;
        this.rear=-1;
    }

    public void enqueue(Integer data){
        if(rear == capacity-1){
            System.out.println("Queue is Full");
            return;
        }
        //First Element
        if(front ==-1){
            front=0;
        }
        que[++rear]=data;
    }

    public Integer dequeue(){
        if(front == -1 || front >rear){
            System.out.println("Queue is Empty");
            return null;
        }
        return que[front++];
    }

    public String toString(){
        if(front ==-1 || front>rear){
            return "[]";

        }
        String res="[";

        for(int i=front;i<rear;i++){
            res+=que[i];

            if(i<rear){
                res+=", ";
            }
        }
        res+="]";
        return res;
    }
}

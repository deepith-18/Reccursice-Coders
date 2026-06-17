package RaghuSir.javaPrograms.DataStrucures.LinkedList;

public class SLQueue {

    static class Node{
        Integer data;
        Node next;
        Node(Integer data){
            this.data=data;
        }
    }

    static class LinkedQueue{
        private Node front;
        private Node rear;


        public void enqueue(Integer data){
            Node n=new Node(data);

            if(rear == null){
                front=rear=n;
                return;
            }
            rear.next=n;
            rear=n;
        }

        public Integer dequeue(){
            if(front==null){
                System.out.println("Queue is empty");
                return null;
            }
            Integer data = front.data;
            front = front.next;

            if(front==null){
                rear=null;
            }
            return data;
        }

        @Override
        public String toString(){
            String res="[";

            Node temp=front;
            while(temp!=null){
                res+=temp.data;

                if(temp.next!=null){
                    res+=", ";
                }
                temp=temp.next;
            }
            res+="]";
            return res;
        }

    }
    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q);

        System.out.println("Removed: " + q.dequeue());

        System.out.println(q);
    }
}

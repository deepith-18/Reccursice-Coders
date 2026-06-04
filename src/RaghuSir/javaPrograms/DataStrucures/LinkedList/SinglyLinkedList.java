package RaghuSir.javaPrograms.DataStrucures.LinkedList;

public class SinglyLinkedList {

    class Node{
        Integer data;
        Node next;

        Node(Integer data){
            this.data=data;
        }
    }
    Node head;

    void addLast(Integer data){
        Node n = new Node(data);
        if(head == null){
            head=n;
        }else{
            Node temp=head;
            while(temp.next != null){
                temp = temp.next;
            }temp.next=n;
        }
    }

    void addFirst(Integer data){
        Node n = new Node(data);
        n.next=head;
        head=n;

    }

    public void display(){
        Node temp = head;
        if(temp.next != null){
            System.out.println(temp.data+"->");
        }else{
            System.out.println(temp.data);
        }
    }

}

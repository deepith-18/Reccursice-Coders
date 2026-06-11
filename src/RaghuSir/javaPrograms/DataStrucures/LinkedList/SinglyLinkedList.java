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
        while(temp.next != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
            System.out.println(temp.data);

    }

    public void add(Integer data,int index){
        Node n = new Node(data);
        if(index == 0){
            n.next=head;
            head=n;
        }else{
            Node temp = head;
            while(temp!=null && index>1){
                temp=temp.next;
                index--;
            }
            if(temp ==null){
                System.out.println("Index is out of range");
                return;
            }
            n.next=temp.next;
            temp.next=n;
        }
    }


    public Integer deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return null;
        }else{
            Integer data = head.data;
            head = head.next;
            return data;
        }
    }

    public Integer deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return null;
        }else{
            Node temp = head;
            Node prev= null;
            while(temp.next != null){
                prev=temp;
                temp = temp.next;
            }
            if(prev == null)
                head=null;
            else
                prev.next=null;

            return temp.data;
        }
    }



}

package MyImplementation;

public class Practice {

 class Node{
     Integer data;
     Node next;

     Node(Integer data){
         this.data=data;
     }

     Node head;



     public void insertFirst(Integer data){
         Node node = new Node(data);
         node.next=head;
        head=node;
     }

     public void insertLast(Integer data){
         Node node = new Node(data);
         if(head == null){
             head=node;
         }else{
             Node temp=head;
             while(temp.next != null){
                 temp=temp.next;
             }
             temp.next= node;
         }
     }

     public Integer deleteFirst(){
         if(head == null ){
             System.out.println("List is empty");
             return null;
         }
         Integer data = head.data;
         head = head.next;
         return data;
     }

     public Integer deleteLast(){
         if(head == null){
             System.out.println("List is empty");
             return null;
         }else{
             Node temp=head;
             Node prev=null;
             while(temp.next != null){
                 prev = temp;
                 temp = temp.next;
             }
             if(prev == null){
                 head = null;
             }else{
                 prev.next=null;
             }
             return temp.data;
         }

     }
     public void insert(Integer data,int index){
            Node node = new Node(data);
            if(index==0){
                node.next=head;
                head=node;
            }else{

                Node temp=head;
                while(temp!=null && index>1){
                    temp = temp.next;
                    index--;
                }
                if(temp== null){
                    System.out.println("Index out of range");
                    return;
                }
                node.next=temp.next;
                temp.next=node;

            }

     }
//
//     public Integer delete(int index){
//
//     }
 }



}

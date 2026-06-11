package RaghuSir.javaPrograms.DataStrucures.LinkedList;
import RaghuSir.javaPrograms.DataStrucures.LinkedList.SinglyLinkedList.Node;
public class Main {

    static void dispRec(Node start){
        if(start == null)
            return;
        System.out.println(start.data);
        dispRec(start.next);
    }

    static void revDisp(Node start){
        if(start.next !=null){
            revDisp(start.next);
        }
        System.out.println(start.data);
    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.addLast(85);
        sl.addLast(89);
        sl.addLast(82);
        sl.addLast(75);
        sl.addFirst(28);
        sl.add(45,2);
        sl.display();


    }
}

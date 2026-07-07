package MyImplementation;

public class Main {
    public static void main(String[] args) {

        SLL sl = new SLL();

        sl.insertFirst(1);
        sl.insertLast(2);
        sl.insertLast(3);
        sl.insertLast(4);

        sl.display();

        sl.deleteFirst();

        sl.display();
        sl.insert(6,1);
        sl.display();
    }
}

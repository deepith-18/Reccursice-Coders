package RaghuSir.javaPrograms.Threading;

public class MainRunner4 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        Thread current  = Thread.currentThread();
        System.out.println(current.getId());
        System.out.println(current.getName());
        System.out.println(current.getPriority());
        current.setName("MainThread");
        System.out.println(current);
        System.out.println("Main method finished");
    }
}

package RaghuSir.javaPrograms.FileHandling.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id,name and percentage: ");
        int id = scanner.nextInt();
        String name = scanner.next();
        Double per = scanner.nextDouble();

        Student student = new Student(id, name, per);

        FileOutputStream fout = new FileOutputStream("C:\\RCB\\src\\RaghuSir\\javaPrograms\\FileHandling\\Serialization\\Student.txt");

        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(student);
        oout.flush();
        fout.flush();
        oout.close();
        fout.close();
        System.out.println("Thank You");
    }
}

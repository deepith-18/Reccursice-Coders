package RaghuSir.javaPrograms.FileHandling.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\RCB\\src\\RaghuSir\\javaPrograms\\FileHandling\\Serialization\\Student.txt"));
        Student student = (Student)ois.readObject(); // Deserializarion

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getPer());
        ois.close();

        }

}

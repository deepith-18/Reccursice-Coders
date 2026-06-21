package RaghuSir.javaPrograms.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainException6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=null;
        try{
            fin = new FileInputStream("C:\\RCB\\src\\RaghuSir\\javaPrograms\\ExceptionHandling\\Hi.txt");
            int ch = fin.read();
            while(ch!=-1){
                System.out.println((char)ch);
                ch=fin.read();
            }
        }catch (FileNotFoundException e){
            System.out.println("File not Present");
            throw  e; // Re throw Exception
        }catch (IOException e){
            System.out.println("We cant read");
            throw e; // re throw Exception
        }
    }
}

//package RaghuSir.javaPrograms.ExceptionHandling;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class FileRead {
//    public static void main(String[] args)  {
//        FileInputStream f1=null;
//        try {
//             f1 = new FileInputStream("C:\RCB\src\RaghuSir\javaPrograms\ExceptionHandling\DeepithN (1).pdf");
//            int ch = f1.read();
//            while(ch!=-1){
//                System.out.println(ch);
//            }
//        }catch (FileNotFoundException f){
//            System.out.println("File is not there in the folder");
//            f.printStackTrace();
//        }catch (IOException i){
//            System.out.println(i.getMessage());
//        }finally {
//            try{
//                f1.close();
//            }catch (IOException | NullPointerException e){
//                System.out.println(e.getMessage());
//            }
//
//        }
//        System.out.println("Thank you");
//    }
//}

package RaghuSir.javaPrograms.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {

        FileInputStream f1 = null;

        try {
            f1 = new FileInputStream(
                    "C:/RCB/src/RaghuSir/javaPrograms/ExceptionHandling/Hi.txt");

            int ch;

            while ((ch = f1.read()) != -1) {
                System.out.println((char)ch);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File is not there in the folder");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                if (f1 != null) {
                    f1.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Thank you");
    }
}

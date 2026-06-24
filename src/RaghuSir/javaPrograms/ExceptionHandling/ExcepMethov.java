package RaghuSir.javaPrograms.ExceptionHandling;

import java.io.*;

class Parent {

    void show() throws IOException {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {

    // ✅ Same Exception
    // void show() throws IOException {
    //     System.out.println("Child Method");
    // }

    // ✅ Child Exception
    @Override
    void show() throws FileNotFoundException {
        System.out.println("Child Method");
    }

    // ❌ Broader Exception (Compile Error)
    // void show() throws Exception {
    //     System.out.println("Child Method");
    // }

    // ✅ Unchecked Exception
    // void show() throws ArithmeticException {
    //     System.out.println("Child Method");
    // }
}

public class ExcepMethov {

    public static void main(String[] args) {

        Parent p = new Child();

        try {
            p.show();
        } catch (IOException e) {
            System.out.println("Exception Handled");
        }
    }
}
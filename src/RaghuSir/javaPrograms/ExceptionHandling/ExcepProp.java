package RaghuSir.javaPrograms.ExceptionHandling;

public class ExcepProp {
    static void m3() {
        int x = 10 / 0; //ArithmeticException

    }
    static void m2(){
        m3();
    }
    static void m1(){
        m2();
    }

    public static void main(String[] args) {

        class Demo {
            static void divide() {
                System.out.println(10 / 0);
            }

            public static void main(String[] args) {
                divide();
                System.out.println("End");
            }
        }
        
        try{
            m1();
        }catch (ArithmeticException e){
            System.out.println("The denominator not be 0");
        }
    }
}

//Exception propagation occurs from called method to caller method.
//Mainly applicable to unchecked exceptions (RuntimeException and its subclasses).
//Checked exceptions must be handled using try-catch or declared using throws.
//If no method handles the exception, JVM terminates the program and prints the stack trace.


//Exception propagation is the process by which an exception thrown in a method is automatically passed to the calling method until it is caught and handled, or reaches the JVM.
package RaghuSir.javaPrograms.Generics;

import java.util.List;

public class MainGenEmp {
    public static void main(String[] args) {

        Employee<Integer,String > emp1 = new Employee<Integer,String >(101,"Rajjd");
        Employee<String,String> emp2 = new Employee<String,String >("RCB12","Daem");



    }
    static void display(List<? super Integer> values) {  }

//    static void write(List <? extends Number> value)
}

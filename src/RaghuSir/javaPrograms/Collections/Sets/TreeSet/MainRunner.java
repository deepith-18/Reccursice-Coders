package RaghuSir.javaPrograms.Collections.Sets.TreeSet;

import java.util.TreeSet;

public class MainRunner {

    public static void main(String[] args) {



        TreeSet<Object> set = new TreeSet<>();

        set.add(new Student(101, "Ravi", 22));
        set.add(new Student(102, "Kiran", 20));

        set.add(new Customer(201, "Deepak", 25));
        set.add(new Customer(202, "Amit", 18));

        set.add(new Employee(301, "Rahul", 23));
        set.add(new Employee(302, "Suresh", 21));

        System.out.println("TreeSet Elements:");

        for (Object obj : set) {
            System.out.println(obj);
        }
    }
}
package RaghuSir.javaPrograms.Collections.Sets.TreeSet;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class MainRunner2 {
    public static void main(String[] args) {

        Comparator<Object> ageComparator= new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                int age1=0;
                int age2=0;
                if(o1 instanceof Student)
                    age1 = ((Student)o1).getAge();
                if(o1 instanceof Customer)
                    age1 = ((Customer)o1).getAge();
                if(o1 instanceof Employee)
                    age1 = ((Employee)o1).getAge();

                if(o2 instanceof Student)
                    age2 = ((Student)o2).getAge();
                if(o2 instanceof Customer)
                    age2 = ((Customer)o2).getAge();
                if(o2 instanceof Employee)
                    age2 = ((Employee)o2).getAge();

                if(age1 ==0 || age2 == 0){
                    return 0;
                }
                return Integer.compare(age1,age2)>0?1:-1;
            }
        };

        TreeSet<Object> set = new TreeSet<>(ageComparator);

        set.add(new Student(101, "Ravi", 22));
        set.add(new Student(102, "Kiran", 20));
        set.add(new Student(101, "Ravi", 22));


        set.add(new Customer(201, "Deepak", 25));
        set.add(new Customer(202, "Amit", 18));
        set.add(new Customer(202, "Amit", 18));


        set.add(new Employee(301, "Rahul", 23));
        set.add(new Employee(302, "Suresh", 21));
        set.add(new Employee(301, "Rahul", 23));


        System.out.println("TreeSet Elements:");

        for (Object obj : set) {
            System.out.println(obj);
        }


    }
}

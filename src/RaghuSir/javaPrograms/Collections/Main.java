package RaghuSir.javaPrograms.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Customer> customers = new HashSet<>();

        customers.add(new Customer(101,"Amar",21));
        customers.add(new Customer(102,"Raajan",31));
        customers.add(new Customer(103,"vikram",25));
        customers.add(new Customer(103,"erythroxylm",21));
        customers.add(new Customer(104,"confirm",26));

        Iterator<Customer> itr= customers.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}



abstract class Employee {
    protected String name;
    protected int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void work();

    void displayInfo() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
    }
}

interface Bonus {
    void calculateBonus();
}

class Developer extends Employee implements Bonus {

    static String company = "TechNova";

    Developer(String name, int id) {
        super(name, id);
    }

    // Constructor Overloading
    Developer(String name) {
        super(name, 0);
    }

    // Method Overloading
    void coding() {
        System.out.println(name + " is coding in Java.");
    }

    void coding(String language) {
        System.out.println(name + " is coding in " + language + ".");
    }

    // Method Overriding
    @Override
    void work() {
        System.out.println(name + " is developing software.");
    }

    @Override
    public void calculateBonus() {
        System.out.println(name + " received bonus: Rs.15000");
    }

    final void attendance() {
        System.out.println(name + " attendance marked.");
    }
}

class Tester extends Developer {

    Tester(String name, int id) {
        super(name, id);
    }

    // Method Overriding
    @Override
    void work() {
        System.out.println(name + " is testing the application.");
    }
}

public class CompanyDemo {

    public static void main(String[] args) {

        // Object Creation
        Developer dev1 = new Developer("Rahul", 101);

        dev1.displayInfo();
        dev1.work();

        // Method Overloading
        dev1.coding();
        dev1.coding("Python");

        dev1.calculateBonus();
        dev1.attendance();

        System.out.println("Company Name : " + Developer.company);

        System.out.println("--------------------------------");

        // Runtime Polymorphism
        Employee emp = new Tester("Sneha", 202);

        emp.displayInfo();
        emp.work();

        System.out.println("--------------------------------");

        // Constructor Overloading
        Developer dev2 = new Developer("Kiran");
        dev2.displayInfo();
    }
}
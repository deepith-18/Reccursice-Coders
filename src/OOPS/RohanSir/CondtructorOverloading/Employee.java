package OOPS.RohanSir.CondtructorOverloading;

public class Employee {
    int id;
    String name;
    double sal;

    // Constructor 1
    public Employee(int id) {
        this.id = id;
    }

    // Constructor 2
    public Employee(int id, String name) {
        this(id);
        this.name = name;
    }

    // Constructor 3
    public Employee(int id, String name, double sal) {
        this(id, name);
        this.sal = sal;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee id     : " + this.id);
        System.out.println("Employee name   : " + this.name);
        System.out.println("Employee salary : " + this.sal);
        System.out.println("--------------------------------");
    }
}

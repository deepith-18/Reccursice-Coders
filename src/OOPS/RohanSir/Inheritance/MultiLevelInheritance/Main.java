package OOPS.RohanSir.Inheritance.MultiLevelInheritance;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        p.eat();

        Developer d = new Developer();
        d.eat();
        d.code();

        Manager m=new Manager();
        m.eat();
        m.code();
        m.conductMeeting();
    }
}

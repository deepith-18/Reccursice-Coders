package OOPS.RohanSir.EqualsMethod;

public class Employee {
    int id;


    Employee(int id){
        this.id=id;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Employee){  //If not downcasted the compiler not know and success in run runtime throws classCast Exception
            Employee e = (Employee) o;
            return this.id == e.id;
        }
        return false;
    }
}

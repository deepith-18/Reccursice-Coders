package OOPS.RohanSir.Manager;

public class Manager extends Developer {
    int noOfEmp;

    Manager(double salary,int noOfEmp,String skill){
        super(salary,skill);
        this.noOfEmp=noOfEmp;
    }
    public void display(){
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Skill: "+skill);
        System.out.println("Number of Employee : "+noOfEmp);
    }
}

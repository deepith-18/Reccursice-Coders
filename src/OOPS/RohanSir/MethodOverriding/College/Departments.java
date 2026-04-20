package OOPS.RohanSir.MethodOverriding.College;

public class Departments {

    String subject;
    double fee;

    public Departments(String subject,double fee){
        this.subject=subject;
        this.fee=fee;
    }



    public void conductTheExam(){
        System.out.println("Conduct the exam");
    }

    public void collectFee(){
        System.out.println("Collect the fee");
    }
}

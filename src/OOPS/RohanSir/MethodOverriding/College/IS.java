package OOPS.RohanSir.MethodOverriding.College;

public class IS extends Departments{

    public IS(String subject, double fee) {
        super(subject, fee);
    }

    @Override
    public void conductTheExam(){
        super.conductTheExam();
        System.out.println("Conduct the exam for"+this.subject +" IS Students");
    }
    @Override
    public void collectFee(){
        super.collectFee();
        System.out.println("Collect fee of"+this.fee+" from the IS Students");
    }
}

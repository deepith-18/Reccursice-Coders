package OOPS.RohanSir.MethodOverriding.College;

public class EC extends Departments{

    public EC(String subject, double fee) {
        super(subject, fee);
    }

    @Override
    public void conductTheExam(){
        super.conductTheExam();
        System.out.println("Conduct the Exam for "+this.subject+" the EC Students");
    }

    @Override
    public void collectFee(){
        super.collectFee();
        System.out.println("Collect Fee of "+this.fee+" from the EC Students");
    }
}

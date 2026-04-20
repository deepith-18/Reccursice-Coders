package OOPS.RohanSir.MethodOverriding.College;

public class CS extends Departments{

    public CS(String subject, double fee) {
        super(subject, fee);
    }

    @Override
    public void conductTheExam(){
        super.conductTheExam();
        System.out.println("Conducting exam for"+this.subject+ "the CS Department");
    }

    @Override
    public void collectFee(){
        super.collectFee();
        System.out.println("Collect Fee of "+this.fee+" form CS Department");
    }
}

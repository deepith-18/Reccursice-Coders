package OOPS.RohanSir.MethodOverriding.College;

public class Main {
    public static void main(String[] args) {
        CS cs = new CS("Maths ",234324.2);
        IS is = new IS("Info",34243);
        EC ec = new EC("Electrics",34234);
        cs.conductTheExam();
        cs.collectFee();
        is.conductTheExam();
        is.collectFee();
        ec.conductTheExam();
        ec.collectFee();
    }
}

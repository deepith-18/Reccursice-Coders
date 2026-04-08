package OOPS.RohanSir.OOPS;

public class PAN {
    String panNo;
    String type;

    PAN(String panNo, String type) {
        this.panNo = panNo;
        this.type = type;
    }

    public static PAN generatePAN(String panNo,String type){
        panNo = panNo.toUpperCase();

        if(panNo.length() != 10){
            panNo= "INVALID PAN";
        }
        return new PAN(panNo,type);
    }

    public String getPanNo(){
        return panNo;
    }

    public String getType(){
        return type;
    }

}

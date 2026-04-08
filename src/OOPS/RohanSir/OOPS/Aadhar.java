package OOPS.RohanSir.OOPS;

public class Aadhar {
        String aadhaarNo;
        String location;

        Aadhar(String aadhaarNo, String location) {
            this.aadhaarNo = aadhaarNo;
            this.location = location;
        }

        public static Aadhar generateAadhar(String aadhaarNo,String location){
            aadhaarNo = aadhaarNo.replaceAll(" ","");

            if(aadhaarNo.length() != 12){
                aadhaarNo = "INAVLID AADHAR";
            }
            return new Aadhar(aadhaarNo,location);
        }

        public String getAadhaarNo(){
            return aadhaarNo;
        }

        public String getLocation(){
            return location;
        }
}

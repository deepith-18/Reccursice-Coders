package OOPS.RohanSir.OOPS;

public class Main {
    public static void main(String[] args) {
      PAN pan1 = PAN.generatePAN("1234567890","adult");
      Aadhar a1=Aadhar.generateAadhar("123456789012","Mysore");

      PAN p2 = PAN.generatePAN("0987654321","Minor");


      Person[] persons = {
              new Person("Deepith",21,pan1,a1),
              new Person("Deekshi",21,p2,null)
      };

      for(Person p:persons){
          System.out.println("\n Name: "+p.getName());
          System.out.println("\nAge is: "+p.getAge());
          if(p.getPan() != null){
              System.out.println("PAN : "+ p.getPan().getPanNo());
          }else{
              System.out.println("PAN NOT AVAILABLE");
          }

          if(p.getAadhaar() != null){
              System.out.println("Aadhar: "+p.getAadhaar().aadhaarNo);
          }else{
              System.out.println("AADHAR NOT AVAILABLE");
          }


      }

    }
}

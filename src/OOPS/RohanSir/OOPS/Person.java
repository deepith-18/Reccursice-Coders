package OOPS.RohanSir.OOPS;

public class Person {
    String name;
    int age;
    PAN pan;
    Aadhar aadhaar;

    Person(String name, int age, PAN pan, Aadhar aadhaar) {
        this.name = name;
        this.age = age;
        this.pan = pan;
        this.aadhaar = aadhaar;
    }

  public String getName(){
        return  name;
  }
  public int getAge(){
        return age;
  }
  public PAN getPan(){
        return pan;
  }
  public Aadhar getAadhaar(){
        return aadhaar;
  }
}
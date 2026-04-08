package OOPS.RohanSir.CondtructorOverloading;

public class Application {
    String name;
    long mobNo;
    String email;
    int exp;
    String address;
    int passOut;


    Application(String name,long mobNo,String email){
        this.name=name;
        this.mobNo=mobNo;
        this.email=email;
    }

    Application(String name,long mobNo,String email,int exp,String address,int passOut){
        this.name=name;
        this.mobNo=mobNo;
        this.email=email;
        this.exp=exp;
        this.address=address;
        this.passOut=passOut;
    }

    Application(String name,long mobNo,String email,int exp) {
        this.name = name;
        this.mobNo = mobNo;
        this.email = email;
        this.exp = exp;
    }

    Application(String name,long mobNo,String email,String address){
        this.name=name;
        this.mobNo=mobNo;
        this.email=email;
        this.address=address;
    }

//    Application(String name,long mobNo,String email,int passOut){
//        this.name=name;
//        this.mobNo=mobNo;
//        this.email=email;
//      this.passOut=passOut;
//    }

    Application(String name,long mobNo,String email,int exp,int passOut){
        this.name=name;
        this.mobNo=mobNo;
        this.email=email;
        this.exp=exp;
        this.passOut=passOut;
    }

    Application(String name,long mobNo,String email,String address,int passOut){
        this.name=name;
        this.mobNo=mobNo;
        this.email=email;
        this.address=address;
        this.passOut=passOut;
    }

    Application(String name,long mobNo,String email,int exp,String address){
        this.name=name;
        this.mobNo=mobNo;
        this.email=email;
        this.exp=exp;
        this.address=address;
    }


    public  void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Mobile Number: "+this.mobNo);
        System.out.println("Email: "+this.email);
        System.out.println("Experience: "+this.exp);
        System.out.println("");
    }

}

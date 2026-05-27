package OOPS.RohanSir.Encapsulation;

import java.io.Serializable;

public class Login implements Serializable {

    private String userName;
    private String password;

    public Login(){}

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String userName){
        char ch = userName.charAt(0);
        if(ch>=48 && ch<=52){
            System.out.println("Invalid Username");
        }else{
            this.userName=userName;
        }
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        if(password.length()<8){
            System.out.println("The password should be of length 8");
        }else {
            this.password = password;
        }
    }
}

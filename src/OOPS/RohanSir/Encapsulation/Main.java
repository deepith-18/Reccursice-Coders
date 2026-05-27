package OOPS.RohanSir.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();

        login.setUserName("Raj");
        login.setPassword("2084f");
        System.out.println(login.getUserName());
        System.out.println(login.getPassword());
    }
}

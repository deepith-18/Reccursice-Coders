package OOPS.RohanSir.Array;

public class Main {
    public static void main(String[] args) {
        Student[] st = new Student[3];

        st[0]= new Student(1,"any");
        st[1]=new Student(2,"bai");
        st[2]= new Student(3,"cau");

        for(int i=0;i<st.length;i++){
            st[i].displayDetails();
        }

    }
}

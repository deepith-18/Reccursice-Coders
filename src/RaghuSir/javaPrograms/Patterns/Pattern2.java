package RaghuSir.javaPrograms.Patterns;

public class Pattern2 {
    public static void main(String[] args) {
//        for(int i = 0 ;i<256;i++){
//            System.out.println(i + " " +(char)(i));
//        }
        pattern8(5);
    }

    static void pattern8(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<n-i+1;j++){
                System.out.print("   ");
            }

            for(int k=1;k<=2*i-1;k++){
                System.out.print((i+k+1)%2+"  ");

            }
            System.out.println();
        }
    }
}

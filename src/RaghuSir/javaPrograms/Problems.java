package RaghuSir.javaPrograms;
import java.util.Scanner;
public class Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int d = sc.nextInt();
//        int n = sc.nextInt();
//
//
//        int ans = ((d-n%7)+7)%7;
//        System.out.println(ans);
        pattern(5);

    }

    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==n||(i+j==n+1||i==j)&&i<=n/2+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

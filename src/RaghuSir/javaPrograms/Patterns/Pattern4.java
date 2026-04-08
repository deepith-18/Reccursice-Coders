package RaghuSir.javaPrograms.Patterns;

import javax.crypto.spec.PSource;

public class Pattern4 {

    /*
          1
        0 1 0
      1 0 1 0 1
    0 1 0 1 0 1 0
      1 0 1 0 1
        0 1 0
          1

     */
    static void pattern(int n) {
        int space = n / 2;
        int start = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= start; k++) {
                System.out.print((i + k + 1) % 2 + " ");
            }
            if (i <= n / 2) {
                space--;
                start = start + 2;
            } else {
                space++;
                start = start - 2;
            }
            System.out.println();
        }
    }

    /*
          1
        1 0 1
      1 0 1 0 1
    1 0 1 0 1 0 1
      1 0 1 0 1
        1 0 1
          1

     */
    static void pattern2(int n) {
        int space = n / 2;
        int start = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= start; k++) {
                System.out.print(k % 2 + " ");
            }
            if (i <= n / 2) {
                space--;
                start += 2;
            } else {
                space++;
                start -= 2;
            }
            System.out.println();
        }
    }

    /*
       1
     0 0 0
   1 1 1 1 1
 0 0 0 0 0 0 0
   1 1 1 1 1
     0 0 0
       1
     */
    static void pattern3(int n) {
        int space = n / 2;
        int start = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= start; k++) {
                System.out.print(i % 2 + " ");
            }
            if (i <= n / 2) {
                space--;
                start += 2;
            } else {
                space++;
                start -= 2;
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        int space = n / 2;
        int start = 1;

        for (int i = 1; i <= n; i++) {
            int peak = 1;
            int middle = start / 2 + 1;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= start; k++) {
                System.out.print(peak + " ");
                if (k < middle) {
                    peak++;
                } else {
                    peak--;
                }
            }
            if (i <= n / 2) {
                space--;
                start += 2;
            } else {
                space++;
                start -= 2;
            }
            System.out.println();
        }
    }


    static void pattern5(int n) {
        int space = n / 2;
        int start = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print(k + " ");
                if (k < i) {
                    System.out.print("* ");
                }

                if (i <= n / 2) {
                    space--;
                    start += 2;
                } else {
                    space++;
                    start -= 2;
                }

                System.out.println();
            }
        }
    }

    static void pattern6(int n){

        for(int i=1;i<=n;i++){
            int t=i;
            int mid=n/2+1;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(k+" ");
                if(t<mid){
                    t--;
                }
            }
            System.out.println();
        }
    }





    static void pattern11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

                if(i==n/2+1||j==n/2+1||i==j||i+j==n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void patternM(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){

                if(j==1||j==n||(i==j || i+j==n+1 )&& i<=n/2+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void patternW(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){

                if(j==1||j==n||(i==j || i+j==n+1 )&& i>=n/2+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    static void pstternbox(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n||i==n/2+1||j==n/2+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


static void pattern8(int n){
        for(int i=1;i<=n;i++){
            int ans=i;
            int mid = ans/2+1;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(ans+" ");
                if(ans>=mid){
                    ans--;
                }else{
                    ans++;
                }

            }
            System.out.println();
        }
}
    static void pattern9(int n){
        for(int i=n;i>=1;i--){
            int ans=i;
            int mid = i;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(ans+" ");
                if(k<mid){
                    ans--;
                }else{
                    ans++;
                }

            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for(int i=1;i<=n;i++){
            int ans=n;
            int mid=i;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(ans+" ");
                if(k<mid){
                    ans--;
                }else{
                    ans++;
                }
            }
            System.out.println();
        }
    }

    static void pattern12(int n){

        for(int i=1;i<=n;i++){
            int ans=n-i+1;
            int mid=i;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(ans+" ");
                if(k<mid){
                    ans++;
                }else{
                    ans--;
                }
            }
            System.out.println();
        }
    }

    public static void main (String[]args){
//        pattern2(7);
    pattern12(5);
    }

}

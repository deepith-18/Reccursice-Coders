package RaghuSir.javaPrograms.Patterns;

public class Pattern3 {
    /*

     *
     **
     ***
     ****
     *****

     */
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    /*
        *
       * *
      * * *
     * * * *
    * * * * *

     */

    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
        *
      * * *
     * * * * *
    * * * * * * *
  * * * * * * * * *
     */
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
     * * * * *
       * * * *
        * * *
         * *
           *

     */

    static void pattern4(int n){
        for(int i=n;i>=1;i--){

            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*
     * * * * * * * * *
       * * * * * * *
        * * * * *
          * * *
            *

     */
    static void pattern5(int n){
        for(int i=n;i>=1;i--){

            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=2*i-1;k>=1;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1
     */
    static void pattern6(int n){
        for(int i=n;i>=1;i--){

            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    /*
            1
         1  0  1
      1  0  1  0  1
   1  0  1  0  1  0  1
1  0  1  0  1  0  1  0  1
     */

    static void pattern7(int n){
        for(int i=1;i<=n;i++){

            for(int j=n-i+1;j>1;j--){
                System.out.print("   ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(k%2+"  ");
            }
            System.out.println();
        }
    }
/*
            1
         0  1  0
      1  0  1  0  1
   0  1  0  1  0  1  0
1  0  1  0  1  0  1  0  1
 */
    static void pattern8(int n){
        for(int i=1;i<=n;i++){

            for(int j=n-i+1;j>1;j--){
                System.out.print("   ");
            }

            for(int k=1;k<=2*i-1;k++){
                System.out.print((i+k+1)%2+"  ");

            }
            System.out.println();
        }
    }

    /*
 5 4 3 2 1
  4 3 2 1
    3 2 1
      2 1
        1

     */

    static void pattern9(int n){
        for(int i=n;i>=1;i--){

            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
    /*
            1
         0  0  0
      1  1  1  1  1
   0  0  0  0  0  0  0
1  1  1  1  1  1  1  1  1
     */

    static void pattern10(int n){
        for(int i=1;i<=n;i++){

            for(int j=n-i+1;j>1;j--){
                System.out.print("   ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(i%2+"  ");
            }
            System.out.println();
        }
    }
/*
        5
      4 5
    3 4 5
  2 3 4 5
1 2 3 4 5

 */
    static void pattern11(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=n-i+1;k<=n;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
/*
        1
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1 
 */

    static void pattern12(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    /*
    1
   1*2
  1*2*3
 1*2*3*4
1*2*3*4*5
     */
    static void pattern13(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int k=1;k<=i;k++){
                System.out.print(k+"");
                if(k<i){
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }

    /*
        *
      * * *
    * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

     */

    static void pattern14(int n){
        int space = n/2;
        int start =1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=start;k++){
                System.out.print("* ");
            }
            if(i<=n/2){
                space--;
                start = start+2;
            }else{
                space++;
                start = start-2;
            }
            System.out.println();
        }
    }


    /*

      * * * * * * *
        * * * * *
          * * *
            *
          * * *
        * * * * *
      * * * * * * *
     */

    static void pattern15(int n){
        int space = 0;
        int start =n;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=start;k++){
                System.out.print("* ");
            }
            if(i<=n/2){
                space++;
                start = start-2;
            }else{
                space--;
                start = start+2;
            }
            System.out.println();
        }
    }

    /*
     * * * * * * *
     * *       * *
     *   *   *   *
     *     *     *
     *   *   *   *
     * *       * *
     * * * * * * *
     */
    static void pattern16(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){

                if (i==1||i==n||j==1||j==n||i==j||i+j==n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }



    }
//    static void pattern17(int n){
//        for(int i=n;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==n/2+1||)
//            }
//        }
//    }







    static void pattern18(int n){
        for(int i=1;i<=n;i++){

            for (int j=n-i+1;j>=1;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern18(6);
    }
}

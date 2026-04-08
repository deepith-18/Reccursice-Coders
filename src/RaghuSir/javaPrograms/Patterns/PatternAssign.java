package RaghuSir.javaPrograms.Patterns;

public class PatternAssign {
    public static void main(String[] args) {

//        pattern15(5);
        pattern14("Deepu");
    }
    /*
    A B C D E
    B C D E
    C D E
    D E
    E
     */
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
    /*
    E D C B A
    D C B A
    C B A
    B A
    A
     */
    static void pattern1(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
/*
    a
    a b
    a b c
    a b c d
    a b c d e
 */
    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
/*
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
 */
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((j%2) + " ");
            }
            System.out.println();
        }
    }
    /*
1
0 0
1 1 1
0 0 0 0
1 1 1 1 1

     */
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((i%2) + " ");
            }
            System.out.println();
        }
    }

    /*

 1
2 3
4 5 6
7 8 9 1
2 3 4 5 6
     */


   static void pattern5(int n){
       int count = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((count%9+1) + " ");
                count++;
            }
            System.out.println();
        }
    }

    /*
1
0 1
0 1 0
1 0 1 0
1 0 1 0 1

     */

    static void pattern6(int n){

        for(int i=1;i<=n;i++){
            int start = ((i/2)%2 == 0)? 1 : 0;
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }
    }

/*
1 1 1 1 1
0 0 0 0
1 1 1
0 0
1
 */
static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print((i%2)+" ");
            }
            System.out.println();
        }
}


/*
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
 */
        static void pattern8(int n){
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }

        /*
1 0 1 0 1
1 0 1 0
1 0 1
1 0
1
         */
 static void pattern9(int n){
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print((j%2)+" ");
                }
                System.out.println();
            }
 }


        /*
5
4 4
3 3 3
2 2 2 2
1 1 1 1 1
         */
        static void pattern10(int n){
        for(int i=n;i>=1;i--){

            for(int j=1;j<=n-i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        }

/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
        static void pattern11(int n){
            for(int i=1;i<=n;i++){
                int num=i;
                for(int j=1;j<=i;j++){
                    System.out.print(num+" ");
                    num = num + (n-j);
                }
                System.out.println();
            }
        }

        /*
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5
         */
        static void pattern12(int n){
            for(int i=1;i<=n;i++){
                for(int j=i;j<=n;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }

        /*
a b c d e
b c d e
c d e
d e
e
         */
        static void pattern13(int n){
            for(int i=1;i<=n;i++){
                for(int j=i;j<=n;j++){
                    System.out.print((char)(j+96)+" ");
                }
                System.out.println();
            }
        }

        static void pattern14(String s){
            for(int i=0;i< s.length();i++){
                for(int j=0;j<=i;j++){
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            }
        }

        /*
A
B C
D E F
G H I J
K L M N O
         */

        static void pattern15(int n){
            char ch='A';
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();
            }
        }
}

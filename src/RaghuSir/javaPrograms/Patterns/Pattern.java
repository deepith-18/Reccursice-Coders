package RaghuSir.javaPrograms.Patterns;

public class Pattern {
    public static void main(String[] args) {

//        int n = 5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(i+","+j+" ");
//            }
//            System.out.println();
//        }
//        pattern(5);
//        pattern2(5);
        pattern17(5);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i % 2 + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(count % 9 + 1 + " ");
                count++;
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(count % 2 + " ");
                count++;
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 96) + " ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (count + 96) + " ");
                count++;
                if (count == 27) count = 1;
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print((char) (count + 64) + " ");
                count++;
            }
            System.out.println();
        }
    }
}
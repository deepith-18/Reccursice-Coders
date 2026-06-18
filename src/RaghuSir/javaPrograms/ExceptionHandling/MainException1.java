package RaghuSir.javaPrograms.ExceptionHandling;
import java.util.Scanner;
public class MainException1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try {
            int[] arr = {23, 35, 23, 42, 12, 23};
            System.out.println("Enter the index to access the element");
            int index = sc.nextInt();
            System.out.println("Enter the divisor");
            String s = sc.next();
            int div = Integer.parseInt(s);
            int q = arr[index] / div;
            System.out.println(q);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter the index in range");
        }catch (RuntimeException e){
            System.out.println("Unexcpected error");
        }catch (Exception e){
            System.out.println("Checked exception");
        }finally {
            System.out.println("Always executes");
        }


    }
}

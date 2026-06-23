package RaghuSir.javaPrograms.ExceptionHandling.EmpOwnExamp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    // Sort by Employee ID
    static Comparator<Employee> idComp =
            (e1, e2) -> e1.getEmpId().compareTo(e2.getEmpId());

    // Sort by Name
    static Comparator<Employee> nameComp =
            (e1, e2) -> e1.getName().compareTo(e2.getName());

    // Sort by Age
    static Comparator<Employee> ageComp =
            (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge());

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "John", 20);
        Employee e2 = new Employee(102, "Doe", 23);
        Employee e3 = new Employee(103, "Blake", 28);
        Employee e4 = new Employee(104, "Maks", 29);
        Employee e5 = new Employee(105, "Jgaas", 30);
        Employee e6 = new Employee(106, "Aunt", 26);

        Employee[] employees = {e1, e2, e3, e4, e5, e6};

        sort(employees);

        System.out.println("\nSorted Employees:");
        System.out.println(Arrays.toString(employees));
    }

    public static void sort(Employee[] emp) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Sorting Option");
        System.out.println("1. Sort by Employee ID");
        System.out.println("2. Sort by Name");
        System.out.println("3. Sort by Age");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                Arrays.sort(emp, idComp);
                break;

            case 2:
                Arrays.sort(emp, nameComp);
                break;

            case 3:
                Arrays.sort(emp, ageComp);
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }
    }
}